package com.seamaction.entity;
// Generated Nov 8, 2015 3:16:52 PM by Hibernate Tools 3.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.NotNull;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment", catalog = "dampevillage")
public class Payment implements java.io.Serializable {

	private int paymentId;
	private String cardType;
	private Long paymentAmount;
	private Date paymentDate;
	private String cardHolderName;
	private String cardExpireYear;
	private String cardExpireMonth;
	private String email;
	private String cardNumber;
	private Set<Reservation> reservations = new HashSet<Reservation>(0);

	public Payment() {
	}

	public Payment(int paymentId) {
		this.paymentId = paymentId;
	}
	public Payment(int paymentId, String cardType, Long paymentAmount,
			Date paymentDate, String cardHolderName, String cardExpireYear,
			String cardExpireMonth, String email, String cardNumber,
			Set<Reservation> reservations) {
		this.paymentId = paymentId;
		this.cardType = cardType;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.cardHolderName = cardHolderName;
		this.cardExpireYear = cardExpireYear;
		this.cardExpireMonth = cardExpireMonth;
		this.email = email;
		this.cardNumber = cardNumber;
		this.reservations = reservations;
	}

	@Id
	@Column(name = "payment_id", unique = true, nullable = false)
	@NotNull
	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Column(name = "card_type")
	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Column(name = "payment_amount")
	public Long getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "payment_date", length = 0)
	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Column(name = "card_holder_name")
	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	@Column(name = "card_expire_year")
	public String getCardExpireYear() {
		return this.cardExpireYear;
	}

	public void setCardExpireYear(String cardExpireYear) {
		this.cardExpireYear = cardExpireYear;
	}

	@Column(name = "card_expire_month")
	public String getCardExpireMonth() {
		return this.cardExpireMonth;
	}

	public void setCardExpireMonth(String cardExpireMonth) {
		this.cardExpireMonth = cardExpireMonth;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "card_number")
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "payment")
	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

}