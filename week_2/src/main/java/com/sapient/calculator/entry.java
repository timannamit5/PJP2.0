package com.sapient.calculator;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "db")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class entry implements Serializable{

	
	private Long id;
	private String inp; 
	private String oup; 
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "input", nullable = false)
	public String getInp() {
		return inp;
	}
	public void setInp(String inp) {
		this.inp = inp;
	}
	
	@Column(name = "output", nullable = false)
	public String getOup() {
		return oup;
	}
	public void setOup(String oup) {
		this.oup = oup;
	}
  
}
