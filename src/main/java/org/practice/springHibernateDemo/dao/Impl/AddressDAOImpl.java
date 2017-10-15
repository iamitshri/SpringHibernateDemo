package org.practice.springHibernateDemo.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.practice.springHibernateDemo.dao.AddressDAO;
import org.practice.springHibernateDemo.entity.Address;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDAOImpl implements  AddressDAO{

	@PersistenceContext
	private EntityManager em;
	
	public void add(Address addr) {
		em.persist(addr);
	}

	public List<Address> listAddress() {
		// TODO Auto-generated method stub
		return null;
	}

}
