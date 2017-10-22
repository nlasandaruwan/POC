package org.test.jsf.mBean;

import javax.faces.bean.ManagedBean;

import org.test.jsf.domain.Customer;
import org.test.jsf.service.CustomerLookupService;
import org.test.jsf.service.CustomerSimpleMap;

@ManagedBean
public class BankingBean {
	private String customerId, password;
	protected Customer customer;

	public String getCustomerId() {
		return (customerId);
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId.trim();
		if (this.customerId.isEmpty()) {
			this.customerId = "(none entered)";
		}
	}

	public String getPassword() {
		return (password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return (customer);
	}

	private static CustomerLookupService lookupService = new CustomerSimpleMap();

	public String showBalance() {
		if (!password.equals("secret")) {
			return ("/WEB-INF/view/bank/wrong-password");
		}
		customer = lookupService.findCustomer(customerId);
		if (customer == null) {
			return ("/WEB-INF/view/bank/unknown-customer");
		} else if (customer.getBalance() < 0) {
			return ("/WEB-INF/view/bank/negative-balance");
		} else if (customer.getBalance() < 10000) {
			return ("/WEB-INF/view/bank/normal-balance");
		} else {
			return ("/WEB-INF/view/bank/high-balance");
		}
	}
}
