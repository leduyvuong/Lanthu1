package com.jsp.shopaoquan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.shopaoquan.DAO.productDAO;
import com.jsp.shopaoquan.Entity.product;



@Service(value = "productService")
@Transactional
public class productService {
	@Autowired
	private productDAO productDAO;
	public List<product> findAll(){
		return productDAO.findAll();
	}
	public product findByID(int id) {
		return productDAO.findbyID(id);
	}
	public void save(product product) {
		productDAO.save(product);;
	}
	public void update(product product) {
		productDAO.update(product);
	}
	public void delete(product product) {
		productDAO.delete(product);
	}
	public List<product> findFP(){
		return productDAO.findFP();
	}
	public List<product> findLP(){
		return productDAO.findLP();
	}
	public List<product> sortPrice(){
		return productDAO.sortPrice();
	}
}
