package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("reservationList")
public class ReservationList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(reservation.airportPickup) like concat(lower(#{reservationList.reservation.airportPickup}),'%')",
			"lower(reservation.arrivalFrom) like concat(lower(#{reservationList.reservation.arrivalFrom}),'%')",
			"lower(reservation.arriveFor) like concat(lower(#{reservationList.reservation.arriveFor}),'%')",
			"lower(reservation.leaveAfter) like concat(lower(#{reservationList.reservation.leaveAfter}),'%')",
			"lower(reservation.nationality) like concat(lower(#{reservationList.reservation.nationality}),'%')",
			"lower(reservation.reservationStatus) like concat(lower(#{reservationList.reservation.reservationStatus}),'%')",
			"lower(reservation.roomCategory) like concat(lower(#{reservationList.reservation.roomCategory}),'%')",
			"lower(reservation.roomType) like concat(lower(#{reservationList.reservation.roomType}),'%')",};

	private Reservation reservation = new Reservation();

	@Override
	public String getEjbql() {
		return "select reservation from Reservation reservation";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public Reservation getReservation() {
		return reservation;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
