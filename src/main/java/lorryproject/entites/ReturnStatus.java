package lorryproject.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="returnstaus")
public class ReturnStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sno2")
	private int sno2;
	
	@Column (name="lorrynum")
	private String lorrynum;

	@Column (name="returndate")
	private Date returndate;

	public int getSno2() {
		return sno2;
	}

	public void setSno2(int sno2) {
		this.sno2 = sno2;
	}

	public String getLorrynum() {
		return lorrynum;
	}

	public void setLorrynum(String lorrynum) {
		this.lorrynum = lorrynum;
	}

	public Date getReturndate() {
		return returndate;
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	

}
