package org.practice.springHibernateDemo.dao;

import java.util.List;

import org.practice.springHibernateDemo.entity.Address;

public interface AddressDAO {
	void add(Address addr);
	List<Address> listAddress();
}
