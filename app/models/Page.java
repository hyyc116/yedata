package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.jpa.GenericModel;

@Entity
public class Page extends GenericModel {
	@Id
	private Long id;

	private String keywords;

	private String path;

	@OneToOne
	private DataPiece data;

	@OneToMany(mappedBy = "page")
	private List<Attr> attrs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public DataPiece getData() {
		return data;
	}

	public void setData(DataPiece data) {
		this.data = data;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<Attr> getAttrs() {
		return attrs;
	}

	public void setAttrs(List<Attr> attrs) {
		this.attrs = attrs;
	}

}
