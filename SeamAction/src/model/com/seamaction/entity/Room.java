package com.seamaction.entity;
// Generated Nov 8, 2015 3:16:52 PM by Hibernate Tools 3.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * Room generated by hbm2java
 */
@Entity
@Table(name = "room", catalog = "dampevillage")
public class Room implements java.io.Serializable {

	private int roomId;
	private RoomCategory roomCategory;
	private RoomType roomType;
	private String roomDescription;
	private String roomNumber;
	private Integer floorNumber;
	private Set<Roomreservation> roomreservations = new HashSet<Roomreservation>(
			0);

	public Room() {
	}

	public Room(int roomId, RoomCategory roomCategory, RoomType roomType) {
		this.roomId = roomId;
		this.roomCategory = roomCategory;
		this.roomType = roomType;
	}
	public Room(int roomId, RoomCategory roomCategory, RoomType roomType,
			String roomDescription, String roomNumber, Integer floorNumber,
			Set<Roomreservation> roomreservations) {
		this.roomId = roomId;
		this.roomCategory = roomCategory;
		this.roomType = roomType;
		this.roomDescription = roomDescription;
		this.roomNumber = roomNumber;
		this.floorNumber = floorNumber;
		this.roomreservations = roomreservations;
	}

	@Id
	@Column(name = "room_Id", unique = true, nullable = false)
	@NotNull
	public int getRoomId() {
		return this.roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_category_id", nullable = false)
	@NotNull
	public RoomCategory getRoomCategory() {
		return this.roomCategory;
	}

	public void setRoomCategory(RoomCategory roomCategory) {
		this.roomCategory = roomCategory;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_type_id", nullable = false)
	@NotNull
	public RoomType getRoomType() {
		return this.roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	@Column(name = "room_description")
	public String getRoomDescription() {
		return this.roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	@Column(name = "room_number")
	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Column(name = "floor_number")
	public Integer getFloorNumber() {
		return this.floorNumber;
	}

	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "room")
	public Set<Roomreservation> getRoomreservations() {
		return this.roomreservations;
	}

	public void setRoomreservations(Set<Roomreservation> roomreservations) {
		this.roomreservations = roomreservations;
	}

}
