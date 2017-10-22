package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("privilageHome")
public class PrivilageHome extends EntityHome<Privilage> {

	public void setPrivilagePrivilageId(Integer id) {
		setId(id);
	}

	public Integer getPrivilagePrivilageId() {
		return (Integer) getId();
	}

	@Override
	protected Privilage createInstance() {
		Privilage privilage = new Privilage();
		return privilage;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Privilage getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Customer> getCustomers() {
		return getInstance() == null ? null : new ArrayList<Customer>(
				getInstance().getCustomers());
	}

}
