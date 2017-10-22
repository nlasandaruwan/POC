package com.seamaction.entity;
// Generated Nov 8, 2015 3:16:52 PM by Hibernate Tools 3.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * AccomodationMode generated by hbm2java
 */
@Entity
@Table(name = "accomodation_mode", catalog = "dampevillage")
public class AccomodationMode implements java.io.Serializable {

	private int accomodationModeId;
	private String accomodation;
	private Set<Reservation> reservations = new HashSet<Reservation>(0);
	private Set<RoomRates> roomRateses = new HashSet<RoomRates>(0);

	public AccomodationMode() {
	}

	public AccomodationMode(int accomodationModeId) {
		this.accomodationModeId = accomodationModeId;
	}
	public AccomodationMode(int accomodationModeId, String accomodation,
			Set<Reservation> reservations, Set<RoomRates> roomRateses) {
		this.accomodationModeId = accomodationModeId;
		this.accomodation = accomodation;
		this.reservations = reservations;
		this.roomRateses = roomRateses;
	}

	@Id
	@Column(name = "accomodation_mode_id", unique = true, nullable = false)
	@NotNull
	public int getAccomodationModeId() {
		return this.accomodationModeId;
	}

	public void setAccomodationModeId(int accomodationModeId) {
		this.accomodationModeId = accomodationModeId;
	}

	@Column(name = "accomodation")
	public String getAccomodation() {
		return this.accomodation;
	}

	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "accomodationMode")
	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "accomodationMode")
	public Set<RoomRates> getRoomRateses() {
		return this.roomRateses;
	}

	public void setRoomRateses(Set<RoomRates> roomRateses) {
		this.roomRateses = roomRateses;
	}

}
