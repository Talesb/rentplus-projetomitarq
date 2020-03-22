package br.com.rentplus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.rentplus.connection.Connection;
import br.com.rentplus.model.Aluguel;
import br.com.rentplus.model.Veiculo;

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
