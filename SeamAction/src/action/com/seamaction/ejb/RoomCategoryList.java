package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("roomCategoryList")
public class RoomCategoryList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(roomCategory.description) like concat(lower(#{roomCategoryList.roomCategory.description}),'%')",
			"lower(roomCategory.imageName) like concat(lower(#{roomCategoryList.roomCategory.imageName}),'%')",
			"lower(roomCategory.roomCategotyType) like concat(lower(#{roomCategoryList.roomCategory.roomCategotyType}),'%')",};

	private RoomCategory roomCategory = new RoomCategory();

	@Override
	public String getEjbql() {
		return "select roomCategory from RoomCategory roomCategory";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public RoomCategory getRoomCategory() {
		return roomCategory;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
