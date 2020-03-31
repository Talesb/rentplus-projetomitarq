package br.com.sellcarplus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.sellcarplus.connection.Connection;
import br.com.sellcarplus.model.negocio.Cliente;

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
