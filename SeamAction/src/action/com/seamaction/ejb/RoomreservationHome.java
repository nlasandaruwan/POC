package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("roomreservationHome")
public class RoomreservationHome extends EntityHome<Roomreservation> {

	@In(create = true)
	ReservationHome reservationHome;
	@In(create = true)
	RoomHome roomHome;

	public void setRoomreservationId(RoomreservationId id) {
		setId(id);
	}

	public RoomreservationId getRoomreservationId() {
		return (RoomreservationId) getId();
	}

	public RoomreservationHome() {
		setRoomreservationId(new RoomreservationId());
	}

	@Override
	public boolean isIdDefined() {
		if (getRoomreservationId().getReservationId() == 0)
			return false;
		if (getRoomreservationId().getRoomId() == 0)
			return false;

		return true;
	}

	@Override
	protected Roomreservation createInstance() {
		Roomreservation roomreservation = new Roomreservation();
		roomreservation.setId(new RoomreservationId());
		return roomreservation;
	}

	public void wire() {
		getInstance();
		Reservation reservation = reservationHome.getDefinedInstance();
		if (reservation != null) {
			getInstance().setReservation(reservation);
		}
		Room room = roomHome.getDefinedInstance();
		if (room != null) {
			getInstance().setRoom(room);
		}
	}

	public boolean isWired() {
		if (getInstance().getReservation() == null)
			return false;
		if (getInstance().getRoom() == null)
			return false;
		return true;
	}

	public Roomreservation getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
