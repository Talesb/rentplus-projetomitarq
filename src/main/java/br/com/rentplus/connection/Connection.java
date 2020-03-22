package br.com.rentplus.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

	private static EntityManager em = null;

	public static EntityManager getConnection() {

		if (em == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("rentplus");

			em = factory.createEntityManager();
		}
		return em;
	}

}
