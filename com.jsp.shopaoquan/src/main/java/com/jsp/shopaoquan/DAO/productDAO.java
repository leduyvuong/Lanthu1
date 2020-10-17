package com.jsp.shopaoquan.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.shopaoquan.Entity.product;



@Repository(value = "productDAO")
@Transactional(rollbackFor = Exception.class)
@Component
public class productDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void save(final product prd) {
		Session session = sessionFactory.getCurrentSession();
		session.save(prd);
	}
	public product findbyID(final int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(product.class, id);
	}
	public void findbyID(final String name_Prd) {
		Session session = sessionFactory.getCurrentSession();
		session.get(product.class, name_Prd);
	}
	public void update(final product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(product);
	}
	public void delete(final product prd) {
		Session session = sessionFactory.getCurrentSession();
		session.remove(prd);
	}
	public List<product> findAll(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("From product", product.class).getResultList();
	}
	public List<product> findFP() {
		Session session = sessionFactory.getCurrentSession();
		List<product> list = session.createQuery("From product", product.class).getResultList();
		List<product> listFP = new ArrayList<product>();
		for (int i = 0; i < 4;i++) {
			Random rd = new Random();
			int j = rd.nextInt(20);
			listFP.add(list.get(j));
		}
		return listFP;
	}
	public List<product> findLP() {
		Session session = sessionFactory.getCurrentSession();
		List<product> list = session.createQuery("From product", product.class).getResultList();
		List<product> listLP = new ArrayList<product>();
		for (int i = list.size()-8; i < list.size();i++) {			
			listLP.add(list.get(i));
		}
		return listLP;
	}
	public List<product> sortPrice(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("Select * From product order by price_prd asc", product.class).getResultList();
	}
}
