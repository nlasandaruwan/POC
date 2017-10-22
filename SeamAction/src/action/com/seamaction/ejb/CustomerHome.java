package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("customerHome")
public class CustomerHome extends EntityHome<Customer> {

	@In(create = true)
	PrivilageHome privilageHome;

	public void setCustomerCustomerId(Integer id) {
		setId(id);
	}

	public Integer getCustomerCustomerId() {
		return (Integer) getId();
	}

	@Override
	protected Customer createInstance() {
		Customer customer = new Customer();
		return customer;
	}

	public void wire() {
		getInstance();
		Privilage privilage = privilageHome.getDefinedInstance();
		if (privilage != null) {
			getInstance().setPrivilage(privilage);
		}
	}

	public boolean isWired() {
		return true;
	}

	public Customer getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Reservation> getReservations() {
		return getInstance() == null ? null : new ArrayList<Reservation>(
				getInstance().getReservations());
	}

}
