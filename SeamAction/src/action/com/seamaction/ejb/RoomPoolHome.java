package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("roomPoolHome")
public class RoomPoolHome extends EntityHome<RoomPool> {

	@In(create = true)
	RoomCategoryHome roomCategoryHome;
	@In(create = true)
	RoomTypeHome roomTypeHome;

	public void setRoomPoolRoomPoolId(Integer id) {
		setId(id);
	}

	public Integer getRoomPoolRoomPoolId() {
		return (Integer) getId();
	}

	@Override
	protected RoomPool createInstance() {
		RoomPool roomPool = new RoomPool();
		return roomPool;
	}

	public void wire() {
		getInstance();
		RoomCategory roomCategory = roomCategoryHome.getDefinedInstance();
		if (roomCategory != null) {
			getInstance().setRoomCategory(roomCategory);
		}
		RoomType roomType = roomTypeHome.getDefinedInstance();
		if (roomType != null) {
			getInstance().setRoomType(roomType);
		}
	}

	public boolean isWired() {
		if (getInstance().getRoomCategory() == null)
			return false;
		if (getInstance().getRoomType() == null)
			return false;
		return true;
	}

	public RoomPool getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
