package com.seamaction.ejb;

import com.seamaction.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("paymentHome")
public class PaymentHome extends EntityHome<Payment> {

	public void setPaymentPaymentId(Integer id) {
		setId(id);
	}

	public Integer getPaymentPaymentId() {
		return (Integer) getId();
	}

	@Override
	protected Payment createInstance() {
		Payment payment = new Payment();
		return payment;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Payment getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Reservation> getReservations() {
		return getInstance() == null ? null : new ArrayList<Reservation>(
				getInstance().getReservations());
	}

}
