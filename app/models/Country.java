package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.GenericModel;

@Entity
public class Country extends GenericModel {
	@Id
	private Long id;
	private String value;
	private String name;
	private int isCralwed;
	@ManyToOne
	private State state;
	@OneToMany(mappedBy = "country")
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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

	public int getIsCralwed() {
		return isCralwed;
	}

	public void setIsCralwed(int isCralwed) {
		this.isCralwed = isCralwed;
	}
	
}
