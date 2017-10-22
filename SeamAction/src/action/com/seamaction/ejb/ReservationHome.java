package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("reservationHome")
public class ReservationHome extends EntityHome<Reservation> {

	@In(create = true)
	AccomodationModeHome accomodationModeHome;
	@In(create = true)
	CustomerHome customerHome;
	@In(create = true)
	PaymentHome paymentHome;

	public void setReservationReservationId(Integer id) {
		setId(id);
	}

	public Integer getReservationReservationId() {
		return (Integer) getId();
	}

	@Override
	protected Reservation createInstance() {
		Reservation reservation = new Reservation();
		return reservation;
	}

	public void wire() {
		getInstance();
		AccomodationMode accomodationMode = accomodationModeHome
				.getDefinedInstance();
		if (accomodationMode != null) {
			getInstance().setAccomodationMode(accomodationMode);
		}
		Customer customer = customerHome.getDefinedInstance();
		if (customer != null) {
			getInstance().setCustomer(customer);
		}
		Payment payment = paymentHome.getDefinedInstance();
		if (payment != null) {
			getInstance().setPayment(payment);
		}
	}

	public boolean isWired() {
		return true;
	}

	public Reservation getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Roomreservation> getRoomreservations() {
		return getInstance() == null ? null : new ArrayList<Roomreservation>(
				getInstance().getRoomreservations());
	}

}
