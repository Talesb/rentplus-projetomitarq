package br.com.rentplus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.rentplus.connection.Connection;
import br.com.rentplus.model.Aluguel;

public class AluguelDao {

	private static EntityManager conexao = null;
	private static EntityTransaction transacao = null;

	public static void save(Aluguel aluguel) {
		conexao = Connection.getConnection();
		transacao = conexao.getTransaction();
		transacao.begin();
		conexao.persist(aluguel);
		transacao.commit();
	}

}
