package com.demo.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column
	private String brandname;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "brands",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("brands")
	private List<Product> prodlist=new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public List<Product> getProdlist() {
		return prodlist;
	}

	public void setProdlist(List<Product> prodlist) {
		this.prodlist = prodlist;
	}

}
