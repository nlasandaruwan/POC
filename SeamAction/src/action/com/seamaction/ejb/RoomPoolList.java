package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("roomPoolList")
public class RoomPoolList extends EntityQuery {

	private static final String[] RESTRICTIONS = {};

	private RoomPool roomPool = new RoomPool();

	@Override
	public String getEjbql() {
		return "select roomPool from RoomPool roomPool";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public RoomPool getRoomPool() {
		return roomPool;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
