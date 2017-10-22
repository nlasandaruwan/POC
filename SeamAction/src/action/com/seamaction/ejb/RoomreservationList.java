package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("roomreservationList")
public class RoomreservationList extends EntityQuery {

	private static final String[] RESTRICTIONS = {};

	private Roomreservation roomreservation;

	public RoomreservationList() {
		roomreservation = new Roomreservation();
		roomreservation.setId(new RoomreservationId());
	}

	@Override
	public String getEjbql() {
		return "select roomreservation from Roomreservation roomreservation";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public Roomreservation getRoomreservation() {
		return roomreservation;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
