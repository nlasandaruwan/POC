package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("accomodationModeHome")
public class AccomodationModeHome extends EntityHome<AccomodationMode> {

	public void setAccomodationModeAccomodationModeId(Integer id) {
		setId(id);
	}

	public Integer getAccomodationModeAccomodationModeId() {
		return (Integer) getId();
	}

	@Override
	protected AccomodationMode createInstance() {
		AccomodationMode accomodationMode = new AccomodationMode();
		return accomodationMode;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public AccomodationMode getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Reservation> getReservations() {
		return getInstance() == null ? null : new ArrayList<Reservation>(
				getInstance().getReservations());
	}
	public List<RoomRates> getRoomRateses() {
		return getInstance() == null ? null : new ArrayList<RoomRates>(
				getInstance().getRoomRateses());
	}

}
