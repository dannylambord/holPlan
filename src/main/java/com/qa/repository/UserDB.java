package com.qa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

@Transactional(value = TxType.SUPPORTS)
public class UserDB {
	
	@PersistenceContext(unitName = "q")
	private EntityManager em;

}
