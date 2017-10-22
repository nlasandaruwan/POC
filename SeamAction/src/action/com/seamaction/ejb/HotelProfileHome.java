package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("hotelProfileHome")
public class HotelProfileHome extends EntityHome<HotelProfile> {

	public void setHotelProfileProfileId(Integer id) {
		setId(id);
	}

	public Integer getHotelProfileProfileId() {
		return (Integer) getId();
	}

	@Override
	protected HotelProfile createInstance() {
		HotelProfile hotelProfile = new HotelProfile();
		return hotelProfile;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public HotelProfile getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
