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

	@PersistenceContext(unitName = "q")
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public Destination create(Destination account) {
		em.persist(account);
		return account;
	}

	public Destination read(int id) {
		Destination destination = em.find(Destination.class, id);
		return destination;
	}
	
	public List<Destination> readAll() {

		TypedQuery<Destination> q = em.createQuery("Select dest from Destination dest" , Destination.class);
		List<Destination> list = q.getResultList();
		return list;
	}

	
	@Transactional(value = TxType.REQUIRED)
	public Destination update(int id, Destination newInfo) {
		Destination account = read(id);
		
		if(newInfo.getCity().equals((account.getCity()))){
			
		}
		else {
			account.setCity(newInfo.getCity());
		}
		
		account.setCountry(newInfo.getCountry());
		System.out.println(read(account.getId()));
		return account;
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void delete(int id) {
		em.remove(read(id));
	}

}
