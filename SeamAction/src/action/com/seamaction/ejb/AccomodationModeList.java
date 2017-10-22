package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("accomodationModeList")
public class AccomodationModeList extends EntityQuery {

	private static final String[] RESTRICTIONS = {"lower(accomodationMode.accomodation) like concat(lower(#{accomodationModeList.accomodationMode.accomodation}),'%')",};

	private AccomodationMode accomodationMode = new AccomodationMode();

	@Override
	public String getEjbql() {
		return "select accomodationMode from AccomodationMode accomodationMode";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public AccomodationMode getAccomodationMode() {
		return accomodationMode;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
