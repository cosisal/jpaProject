package jpa.test;

import java.util.List;

import javax.persistence.EntityManager;

import jpa.entities.Anagrafica;
import jpa.factories.JPAEntityManagerFactory;

public class JPATest {

	public static void main(String[] args) {
		JPAEntityManagerFactory jpaEntityManagerFactory = new JPAEntityManagerFactory();
		EntityManager entityManager = jpaEntityManagerFactory.getEntityManager("anagrafica");
		entityManager.getTransaction().begin();
		
		List<Anagrafica> anagraficaList = entityManager.createQuery("SELECT a FROM anagrafica a").getResultList();
		
		for (Anagrafica anagrafica : anagraficaList) {
			System.out.println(anagrafica.getCodiceFiscale());
		}
		
		Anagrafica giorgia = new Anagrafica();
		giorgia.setCodiceFiscale("CSOGRG16D64A669U");
		giorgia.setCognome("Cosi");
		giorgia.setNome("Giorgia");
		
		entityManager.persist(giorgia);
		
		entityManager.getTransaction().rollback();
		
		anagraficaList = entityManager.createQuery("SELECT a FROM anagrafica a").getResultList();
		
		for (Anagrafica anagrafica : anagraficaList) {
			System.out.println(anagrafica.getCodiceFiscale());
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
		jpaEntityManagerFactory.factoryShutDown();

	}

}
