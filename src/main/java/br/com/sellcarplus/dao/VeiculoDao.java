package br.com.sellcarplus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.sellcarplus.connection.Connection;
import br.com.sellcarplus.model.negocio.Veiculo;

public class VeiculoDao {

	private static EntityManager conexao = null;
	private static EntityTransaction transacao = null;

	public static <T extends Veiculo> void save(T veiculo) {
		conexao = Connection.getConnection();
		transacao = conexao.getTransaction();
		transacao.begin();
		conexao.persist(veiculo);
		transacao.commit();
	}

}
