package com.seamaction.ejb;

import com.seamaction.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.List;
import java.util.Arrays;

@Name("paymentList")
public class PaymentList extends EntityQuery {

	private static final String[] RESTRICTIONS = {
			"lower(payment.cardExpireMonth) like concat(lower(#{paymentList.payment.cardExpireMonth}),'%')",
			"lower(payment.cardExpireYear) like concat(lower(#{paymentList.payment.cardExpireYear}),'%')",
			"lower(payment.cardHolderName) like concat(lower(#{paymentList.payment.cardHolderName}),'%')",
			"lower(payment.cardNumber) like concat(lower(#{paymentList.payment.cardNumber}),'%')",
			"lower(payment.cardType) like concat(lower(#{paymentList.payment.cardType}),'%')",
			"lower(payment.email) like concat(lower(#{paymentList.payment.email}),'%')",};

	private Payment payment = new Payment();

	@Override
	public String getEjbql() {
		return "select payment from Payment payment";
	}

	@Override
	public Integer getMaxResults() {
		return 25;
	}

	public Payment getPayment() {
		return payment;
	}

	@Override
	public List<String> getRestrictions() {
		return Arrays.asList(RESTRICTIONS);
	}

}
