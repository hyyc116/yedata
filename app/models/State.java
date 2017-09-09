package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.db.jpa.GenericModel;

@Entity
public class State extends GenericModel {

	@Id
	private Long id;
	private String value;
	private String name;

	@OneToMany(mappedBy = "state")
	private List<MSA> msas;
	@OneToMany(mappedBy = "state")
	private List<Country> countries;
	@OneToMany(mappedBy = "state")
	private List<DataPiece> datas;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MSA> getMsas() {
		return msas;
	}

	public void setMsas(List<MSA> msas) {
		this.msas = msas;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<DataPiece> getDatas() {
		return datas;
	}

	public void setDatas(List<DataPiece> datas) {
		this.datas = datas;
	}

}
