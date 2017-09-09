package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.GenericModel;

@Entity
public class DataPiece extends GenericModel {
	@Id
	private Long id;
	@ManyToOne
	private State state;
	@ManyToOne
	private MSA msa;
	@ManyToOne
	private Country country;

	private int year;

	@OneToOne
	private Page businessall;

	@OneToOne
	private Page businessresident;

	@OneToOne
	private Page businessnonresident;

	@OneToOne
	private Page businessnoncommercial;

	@OneToOne
	private Page jobs;

	@OneToOne
	private Page gained;

	@OneToOne
	private Page lost;

	@OneToOne
	private Page netchange;

	@OneToOne
	private Page saleall;
	@OneToOne
	private Page salesperemployee;
	@OneToOne
	private Page salesperbusiness;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public MSA getMsa() {
		return msa;
	}

	public void setMsa(MSA msa) {
		this.msa = msa;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Page getBusinessall() {
		return businessall;
	}

	public void setBusinessall(Page businessall) {
		this.businessall = businessall;
	}

	public Page getBusinessresident() {
		return businessresident;
	}

	public void setBusinessresident(Page businessresident) {
		this.businessresident = businessresident;
	}

	public Page getBusinessnonresident() {
		return businessnonresident;
	}

	public void setBusinessnonresident(Page businessnonresident) {
		this.businessnonresident = businessnonresident;
	}

	public Page getBusinessnoncommercial() {
		return businessnoncommercial;
	}

	public void setBusinessnoncommercial(Page businessnoncommercial) {
		this.businessnoncommercial = businessnoncommercial;
	}

	public Page getJobs() {
		return jobs;
	}

	public void setJobs(Page jobs) {
		this.jobs = jobs;
	}

	public Page getGained() {
		return gained;
	}

	public void setGained(Page gained) {
		this.gained = gained;
	}

	public Page getLost() {
		return lost;
	}

	public void setLost(Page lost) {
		this.lost = lost;
	}

	public Page getNetchange() {
		return netchange;
	}

	public void setNetchange(Page netchange) {
		this.netchange = netchange;
	}

	public Page getSaleall() {
		return saleall;
	}

	public void setSaleall(Page saleall) {
		this.saleall = saleall;
	}

	public Page getSalesperemployee() {
		return salesperemployee;
	}

	public void setSalesperemployee(Page salesperemployee) {
		this.salesperemployee = salesperemployee;
	}

	public Page getSalesperbusiness() {
		return salesperbusiness;
	}

	public void setSalesperbusiness(Page salesperbusiness) {
		this.salesperbusiness = salesperbusiness;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
