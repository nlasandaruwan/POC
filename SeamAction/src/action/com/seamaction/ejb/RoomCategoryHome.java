package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("roomCategoryHome")
public class RoomCategoryHome extends EntityHome<RoomCategory> {

	public void setRoomCategoryRoomCategoryId(Integer id) {
		setId(id);
	}

	public Integer getRoomCategoryRoomCategoryId() {
		return (Integer) getId();
	}

	@Override
	protected RoomCategory createInstance() {
		RoomCategory roomCategory = new RoomCategory();
		return roomCategory;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public RoomCategory getDefinedInstance() {
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
