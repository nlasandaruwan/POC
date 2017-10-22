package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("privilageList")
public class PrivilageList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(privilage.description) like concat(lower(#{privilageList.privilage.description}),'%')",
			"lower(privilage.privilageName) like concat(lower(#{privilageList.privilage.privilageName}),'%')",};

	private Privilage privilage = new Privilage();

	@Override
	public String getEjbql() {
		return "select privilage from Privilage privilage";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public Privilage getPrivilage() {
		return privilage;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
