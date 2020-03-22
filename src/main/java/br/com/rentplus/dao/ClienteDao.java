package br.com.rentplus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.rentplus.connection.Connection;
import br.com.rentplus.model.Cliente;

public class ClienteDao {

	private static EntityManager conexao = null;
	private static EntityTransaction transacao = null;

	public static void save(Cliente cliente) {
		conexao = Connection.getConnection();
		transacao = conexao.getTransaction();
		transacao.begin();
		conexao.persist(cliente);
		transacao.commit();
	}

}
