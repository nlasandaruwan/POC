package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("roomTypeHome")
public class RoomTypeHome extends EntityHome<RoomType> {

	public void setRoomTypeRoomTypeId(Integer id) {
		setId(id);
	}

	public Integer getRoomTypeRoomTypeId() {
		return (Integer) getId();
	}

	@Override
	protected RoomType createInstance() {
		RoomType roomType = new RoomType();
		return roomType;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public RoomType getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<RoomPool> getRoomPools() {
		return getInstance() == null ? null : new ArrayList<RoomPool>(
				getInstance().getRoomPools());
	}
	public List<RoomRates> getRoomRateses() {
		return getInstance() == null ? null : new ArrayList<RoomRates>(
				getInstance().getRoomRateses());
	}
	public List<Room> getRooms() {
		return getInstance() == null ? null : new ArrayList<Room>(getInstance()
				.getRooms());
	}

}
