package in.uday.entity;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)->Integer use in MYSQL
	@GeneratedValue(strategy = GenerationType.UUID)
	private String pid;
	private String pname;
	private Double price;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;

	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getCreateddate() {
		return createdDate;
	}
	public void setCreateddate(LocalDate createddate) {
		this.createdDate = createddate;
	}
	public LocalDate getUpdateddate() {
		return updatedDate;
	}
	public void setUpdateddate(LocalDate updateddate) {
		this.updatedDate = updateddate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", createddate=" + createdDate
				+ ", updateddate=" + updatedDate + "]";
	}

}

