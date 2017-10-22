package org.test.jsf.mBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.test.jsf.service.CustomerLookupService;

@ManagedBean
public class BankingBeanDI extends BankingBean {

	@ManagedProperty(value = "#{currentLookupService}")
	private CustomerLookupService service;

	public CustomerLookupService getService() {
		return service;
	}

	public void setService(CustomerLookupService service) {
		this.service = service;
	}

	public String showBalance() {
		if (!getPassword().equals("secret")) {
			return ("/WEB-INF/view/bank/wrong-password");
		}
		customer = service.findCustomer(getCustomerId());
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
