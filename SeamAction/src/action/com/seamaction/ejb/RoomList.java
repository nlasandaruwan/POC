package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("roomList")
public class RoomList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(room.roomDescription) like concat(lower(#{roomList.room.roomDescription}),'%')",
			"lower(room.roomNumber) like concat(lower(#{roomList.room.roomNumber}),'%')",};

	private Room room = new Room();

	@Override
	public String getEjbql() {
		return "select room from Room room";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public Room getRoom() {
		return room;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
