package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("roomRatesHome")
public class RoomRatesHome extends EntityHome<RoomRates> {

	@In(create = true)
	AccomodationModeHome accomodationModeHome;
	@In(create = true)
	RoomCategoryHome roomCategoryHome;
	@In(create = true)
	RoomTypeHome roomTypeHome;

	public void setRoomRatesRoomRateId(Integer id) {
		setId(id);
	}

	public Integer getRoomRatesRoomRateId() {
		return (Integer) getId();
	}

	@Override
	protected RoomRates createInstance() {
		RoomRates roomRates = new RoomRates();
		return roomRates;
	}

	public void wire() {
		getInstance();
		AccomodationMode accomodationMode = accomodationModeHome
				.getDefinedInstance();
		if (accomodationMode != null) {
			getInstance().setAccomodationMode(accomodationMode);
		}
		RoomCategory roomCategory = roomCategoryHome.getDefinedInstance();
		if (roomCategory != null) {
			getInstance().setRoomCategory(roomCategory);
		}
		RoomType roomType = roomTypeHome.getDefinedInstance();
		if (roomType != null) {
			getInstance().setRoomType(roomType);
		}
	}

	public boolean isWired() {
		if (getInstance().getAccomodationMode() == null)
			return false;
		if (getInstance().getRoomCategory() == null)
			return false;
		if (getInstance().getRoomType() == null)
			return false;
		return true;
	}

	public RoomRates getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
