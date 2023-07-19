package lorryproject.entites;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="lorrystatuss")
public class LorryStatus {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="sno1")
private int sno1;
 @Column(name="lorrynum")
 private String lorrynum;

 @Column(name="fromcity")
 private String from;

 @Column(name="tocity")
 private String to;

 @Column(name="price")
 private Double price;
 

 @Column(name="startdate")
 private Date startdate;

 @Column(name="typeofload")
 private String loadtype;
 
 

public int getSno1() {
	return sno1;
}

public void setSno1(int sno1) {
	this.sno1 = sno1;
}

public String getLorrynum() {
	return lorrynum;
}

public void setLorrynum(String lorrynum) {
	this.lorrynum = lorrynum;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public Date getStartdate() {
	return startdate;
}

public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

public String getLoadtype() {
	return loadtype;
}

public void setLoadtype(String loadtype) {
	this.loadtype = loadtype;
}

@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lorrynum", updatable = false, insertable = false)
	@JsonIgnore
	private LorryInformation lorryinformation;



public LorryInformation getLorryinformation() {
	return lorryinformation;
}

public void setLorryinformation(LorryInformation lorryinformation) {
	this.lorryinformation = lorryinformation;
}


 
}
