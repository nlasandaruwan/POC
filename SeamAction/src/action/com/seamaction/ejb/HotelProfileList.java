package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("hotelProfileList")
public class HotelProfileList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(hotelProfile.address1) like concat(lower(#{hotelProfileList.hotelProfile.address1}),'%')",
			"lower(hotelProfile.address2) like concat(lower(#{hotelProfileList.hotelProfile.address2}),'%')",
			"lower(hotelProfile.city) like concat(lower(#{hotelProfileList.hotelProfile.city}),'%')",
			"lower(hotelProfile.contactNumber1) like concat(lower(#{hotelProfileList.hotelProfile.contactNumber1}),'%')",
			"lower(hotelProfile.contactNumber2) like concat(lower(#{hotelProfileList.hotelProfile.contactNumber2}),'%')",
			"lower(hotelProfile.country) like concat(lower(#{hotelProfileList.hotelProfile.country}),'%')",
			"lower(hotelProfile.direction) like concat(lower(#{hotelProfileList.hotelProfile.direction}),'%')",
			"lower(hotelProfile.email) like concat(lower(#{hotelProfileList.hotelProfile.email}),'%')",
			"lower(hotelProfile.fax) like concat(lower(#{hotelProfileList.hotelProfile.fax}),'%')",
			"lower(hotelProfile.hotelDescription) like concat(lower(#{hotelProfileList.hotelProfile.hotelDescription}),'%')",
			"lower(hotelProfile.hotelName) like concat(lower(#{hotelProfileList.hotelProfile.hotelName}),'%')",
			"lower(hotelProfile.otherWebs) like concat(lower(#{hotelProfileList.hotelProfile.otherWebs}),'%')",
			"lower(hotelProfile.postalCode) like concat(lower(#{hotelProfileList.hotelProfile.postalCode}),'%')",};

	private HotelProfile hotelProfile = new HotelProfile();

	@Override
	public String getEjbql() {
		return "select hotelProfile from HotelProfile hotelProfile";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public HotelProfile getHotelProfile() {
		return hotelProfile;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
