package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.Destination;
import com.qa.model.User;

@Transactional(value = TxType.SUPPORTS)
public class UserDB implements UserRepository {
	
	@PersistenceContext(unitName = "q")
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public User create(User user) {
		em.persist(user);
		return user;
	}
	
	public List<User> readAll() {

		TypedQuery<User> q = em.createQuery("Select user from User user" , User.class);
		List<User> list = q.getResultList();
		return list;
	}

}
