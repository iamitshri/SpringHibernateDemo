package org.practice.springHibernateDemo.service.impl;


import org.practice.springHibernateDemo.dao.AddressDAO;
import org.practice.springHibernateDemo.entity.Address;
import org.practice.springHibernateDemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressDAO dao;
	
	@Transactional
	public void add(Address ad) {
		 dao.add(ad);
	}

}
