package lorryproject.entites;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "lorryinformation")
public class LorryInformation {
	//columns

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sno")
	private int sno;
	@Id
	@Column(name = "lorrynum")
	private String lorrynum;
	@Column(name = "lorrystatus")
	private String status;
	
	@OneToMany(mappedBy = "lorryinformation")
	@JsonIgnore // ignore the property from serialization
	private List<LorryStatus> lorryStatus = new ArrayList<LorryStatus>();


	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getLorrynum() {
		return lorrynum;
	}

	public void setLorrynum(String lorrynum) {
		this.lorrynum = lorrynum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<LorryStatus> getLorryStatus() {
		return lorryStatus;
	}

	public void setLorryStatus(List<LorryStatus> lorryStatus) {
		this.lorryStatus = lorryStatus;
	}

}
