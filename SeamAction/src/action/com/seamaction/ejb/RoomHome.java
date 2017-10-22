package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("roomHome")
public class RoomHome extends EntityHome<Room> {

	@In(create = true)
	RoomCategoryHome roomCategoryHome;
	@In(create = true)
	RoomTypeHome roomTypeHome;

	public void setRoomRoomId(Integer id) {
		setId(id);
	}

	public Integer getRoomRoomId() {
		return (Integer) getId();
	}

	@Override
	protected Room createInstance() {
		Room room = new Room();
		return room;
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

	public Room getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Roomreservation> getRoomreservations() {
		return getInstance() == null ? null : new ArrayList<Roomreservation>(
				getInstance().getRoomreservations());
	}

}
