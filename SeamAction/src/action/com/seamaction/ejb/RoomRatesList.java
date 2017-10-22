package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("roomRatesList")
public class RoomRatesList extends EntityQuery {

	private static final String[] RESTRICTIONS = {};

	private RoomRates roomRates = new RoomRates();

	@Override
	public String getEjbql() {
		return "select roomRates from RoomRates roomRates";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public RoomRates getRoomRates() {
		return roomRates;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
