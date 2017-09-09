package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.jpa.GenericModel;

@Entity
public class Attr extends GenericModel {

	@Id
	private long id;

	private String attr_name;

	private String attr_value;

	private String attr_of_total;

	@ManyToOne
	private Page page;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttr_name() {
		return attr_name;
	}

	public void setAttr_name(String attr_name) {
		this.attr_name = attr_name;
	}

	public String getAttr_value() {
		return attr_value;
	}

	public void setAttr_value(String attr_value) {
		this.attr_value = attr_value;
	}

	public String getAttr_of_total() {
		return attr_of_total;
	}

	public void setAttr_of_total(String attr_of_total) {
		this.attr_of_total = attr_of_total;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

}
