package ro.fiipractic.core.base;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "studenti", schema = "fii-practic")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "studenti")

public abstract class Persoana  extends BaseEntity{
	
	
	@Column(name = "nume", nullable = false, length = 50)
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	    

}
