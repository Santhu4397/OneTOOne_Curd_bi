package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Item;
import Dto.invoice;

public class invoicedao {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public EntityManager getmanager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("santhu");
		return entityManagerFactory.createEntityManager();

	}

	public void save(invoice i, Item e) {
		entityManager = getmanager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(i);
		entityTransaction.commit();
	}

	public invoice getinvoice(int id) {

		entityManager = getmanager();
		return entityManager.find(invoice.class, id);
	}

	public Item getItem(int id) {

		entityManager = getmanager();
		return entityManager.find(Item.class, id);
	}

	public void delete(int id) {
		entityManager = getmanager();
		entityTransaction = entityManager.getTransaction();
		invoice invoice = entityManager.find(invoice.class, id);
		System.out.println(invoice);

		if (invoice != null) {
			entityTransaction.begin();
			entityManager.remove(invoice);
			entityTransaction.commit();
		}

	}

	public void update(invoice i) {
		entityManager = getmanager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(i);
		entityTransaction.commit();
	}

}
