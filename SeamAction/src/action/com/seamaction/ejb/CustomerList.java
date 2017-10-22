package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("customerList")
public class CustomerList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(customer.address1) like concat(lower(#{customerList.customer.address1}),'%')",
			"lower(customer.address2) like concat(lower(#{customerList.customer.address2}),'%')",
			"lower(customer.contactLand) like concat(lower(#{customerList.customer.contactLand}),'%')",
			"lower(customer.contactMobile) like concat(lower(#{customerList.customer.contactMobile}),'%')",
			"lower(customer.country) like concat(lower(#{customerList.customer.country}),'%')",
			"lower(customer.email) like concat(lower(#{customerList.customer.email}),'%')",
			"lower(customer.firstName) like concat(lower(#{customerList.customer.firstName}),'%')",
			"lower(customer.lastName) like concat(lower(#{customerList.customer.lastName}),'%')",
			"lower(customer.nicPassportNo) like concat(lower(#{customerList.customer.nicPassportNo}),'%')",
			"lower(customer.password) like concat(lower(#{customerList.customer.password}),'%')",
			"lower(customer.passwordRecoverAnswer) like concat(lower(#{customerList.customer.passwordRecoverAnswer}),'%')",
			"lower(customer.passwordRecoverQuestion) like concat(lower(#{customerList.customer.passwordRecoverQuestion}),'%')",
			"lower(customer.postalCode) like concat(lower(#{customerList.customer.postalCode}),'%')",
			"lower(customer.state) like concat(lower(#{customerList.customer.state}),'%')",
			"lower(customer.streetNumber) like concat(lower(#{customerList.customer.streetNumber}),'%')",
			"lower(customer.title) like concat(lower(#{customerList.customer.title}),'%')",
			"lower(customer.userName) like concat(lower(#{customerList.customer.userName}),'%')",};

	private Customer customer = new Customer();

	@Override
	public String getEjbql() {
		return "select customer from Customer customer";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public Customer getCustomer() {
		return customer;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
