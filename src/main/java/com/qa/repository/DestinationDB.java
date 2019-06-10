package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.Destination;



@Transactional(value = TxType.SUPPORTS)
public class DestinationDB implements DestinationRepository{

	@PersistenceContext(unitName = "myPU")
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public Destination create(Destination account) {
		em.persist(account);
		return account;
	}



}
