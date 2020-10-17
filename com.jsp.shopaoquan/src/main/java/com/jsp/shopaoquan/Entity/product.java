package com.jsp.shopaoquan.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class product {
	@Id
	@Column(name = "id_prd")
	private int idPrd;
	@Column(name = "name_prd")
	private String name_Prd;
	@Column(name = "price_prd")
	private float price_Prd;
	@Column(name = "image_prd")
	private String img_Prd;
	
	@Column(name = "id_prd_type")
	private int id_type;

	public int getIdPrd() {
		return idPrd;
	}

	public void setIdPrd(int idPrd) {
		this.idPrd = idPrd;
	}

	public String getName_Prd() {
		return name_Prd;
	}

	public void setName_Prd(String name_Prd) {
		this.name_Prd = name_Prd;
	}

	public float getPrice_Prd() {
		return price_Prd;
	}

	public void setPrice_Prd(float price_Prd) {
		this.price_Prd = price_Prd;
	}

	public String getImg_Prd() {
		return img_Prd;
	}

	public void setImg_Prd(String img_Prd) {
		this.img_Prd = img_Prd;
	}

	public int getId_type() {
		return id_type;
	}

	public void setId_type(int id_type) {
		this.id_type = id_type;
	}
	
}
