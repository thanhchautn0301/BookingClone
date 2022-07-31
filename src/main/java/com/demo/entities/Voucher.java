package com.demo.entities;// default package
// Generated Jul 13, 2022, 9:23:11 AM by Hibernate Tools 4.3.5.Final

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Voucher generated by hbm2java
 */
@Entity
@Table(name = "voucher", catalog = "booking")
public class Voucher implements java.io.Serializable {

	private Integer id;
	private Accomodation accomodation;
	private Double priceDiscount;
	@JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
	private Date expDate;
	private boolean status;
	private Set<Invoice> invoices = new HashSet<Invoice>(0);

	public Voucher() {
	}

	public Voucher(boolean status) {
		this.status = status;
	}

	public Voucher(Accomodation accomodation, Double priceDiscount, Date expDate, boolean status,
			Set<Invoice> invoices) {
		this.accomodation = accomodation;
		this.priceDiscount = priceDiscount;
		this.expDate = expDate;
		this.status = status;
		this.invoices = invoices;
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
	@JoinColumn(name = "ACCOMODATION_ID")
	public Accomodation getAccomodation() {
		return this.accomodation;
	}

	public void setAccomodation(Accomodation accomodation) {
		this.accomodation = accomodation;
	}

	@Column(name = "PRICE_DISCOUNT", precision = 22, scale = 0)
	public Double getPriceDiscount() {
		return this.priceDiscount;
	}

	public void setPriceDiscount(Double priceDiscount) {
		this.priceDiscount = priceDiscount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXP_DATE", length = 10)
	public Date getExpDate() {
		return this.expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	@Column(name = "STATUS", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "voucher")
	public Set<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}
	private String name;
	@Column(name = "NAME", nullable = false, length = 250)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
