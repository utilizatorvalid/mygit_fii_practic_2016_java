package ro.fiipractic.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ro.fiipractic.core.base.BaseEntity;
//import ro.fiipractic.core.base.Persoana;

@Entity
@Table(name = "studenti", schema = "fii-practic")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "studenti")
public class Student extends BaseEntity {
	
	
	@Column(name = "nume", nullable = false, length = 50)
	private String nume;

		
	@Column(name = "matricol", nullable = false, length = 50)
	private String matricol;
    
	//@Column(name = "an_studiu", nullable = false)
	//private int anStudiu;
	
  

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricol == null) ? 0 : matricol.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        if (matricol == null) {
            if (other.matricol != null) {
                return false;
            }
        } else if (!matricol.equals(other.matricol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Studentul: [matricol=" + matricol + "]";
        // de adaugat si alte date
    }
    
    public String getMatricol() {
		return matricol;
	}

	public void setMatricol(String matricol) {
		this.matricol = matricol;
	}
/*
	public int getAnStudiu() {
		return anStudiu;
	}

	public void setAnStudiu(int anStudiu) {
		this.anStudiu = anStudiu;
	}
*/
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}


}
