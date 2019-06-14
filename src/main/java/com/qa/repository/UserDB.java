package com.qa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.Destination;
import com.qa.model.User;

@Transactional(value = TxType.SUPPORTS)
public class UserDB {
	
	@PersistenceContext(unitName = "q")
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public User create(User user) {
		em.persist(user);
		return user;
	}

}
