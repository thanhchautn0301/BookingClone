package com.demo.entities;// default package
// Generated Jul 13, 2022, 9:23:11 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Accomodation generated by hbm2java
 */
@Entity
@Table(name = "accomodation", catalog = "booking")
public class Accomodation implements java.io.Serializable {

	private Integer id;
	private Category category;
	private City city;
	private Staff staff;
	private String name;
	private boolean status;
	private String description;

	private Set<Service> services = new HashSet<Service>(0);
	private Set<Image> images = new HashSet<Image>(0);
	private Set<Room> rooms = new HashSet<Room>(0);
	private Set<Voucher> vouchers = new HashSet<Voucher>(0);

	public Accomodation() {
	}

	public Accomodation(boolean status) {
		this.status = status;
	}

	public Accomodation(Category category, City city, Staff staff, String name, boolean status, String description, Set<Service> services,
                        Set<Image> images, Set<Room> rooms, Set<Voucher> vouchers) {
		this.category = category;
		this.city = city;
		this.staff = staff;
		this.name = name;
		this.status = status;
		this.description = description;
		this.services = services;
		this.images = images;
		this.rooms = rooms;
		this.vouchers = vouchers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CITY_ID")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STAFF_ID")
	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Column(name = "NAME", length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "STATUS", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accomodation")
	public Set<Service> getServices() {
		return this.services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accomodation")
	public Set<Image> getImages() {
		return this.images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accomodation")
	public Set<Room> getRooms() {
		return this.rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accomodation")
	public Set<Voucher> getVouchers() {
		return this.vouchers;
	}

	public void setVouchers(Set<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

}
