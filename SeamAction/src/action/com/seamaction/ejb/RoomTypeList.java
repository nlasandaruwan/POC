package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("roomTypeList")
public class RoomTypeList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(roomType.description) like concat(lower(#{roomTypeList.roomType.description}),'%')",
			"lower(roomType.roomType) like concat(lower(#{roomTypeList.roomType.roomType}),'%')",};

	private RoomType roomType = new RoomType();

	@Override
	public String getEjbql() {
		return "select roomType from RoomType roomType";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
