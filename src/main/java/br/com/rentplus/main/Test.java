package br.com.rentplus.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.rentplus.dao.AluguelDao;
import br.com.rentplus.dao.ClienteDao;
import br.com.rentplus.dao.VeiculoDao;
import br.com.rentplus.model.Aluguel;
import br.com.rentplus.model.Carro;
import br.com.rentplus.model.Cliente;
import br.com.rentplus.model.Moto;
import br.com.rentplus.model.Veiculo;

public class Test {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("12345678910");
		cliente.setDataNascimento(new Date(1990, 4, 21));
		cliente.setNome("Teste");

		Carro c1 = new Carro();
		c1.setAno(2015);
		c1.setNome("Cruze");
		c1.setMarca("GM");
		c1.setCor("Prata");
		c1.setModelo("Sedan");
		c1.setQtdAssento(5);
		c1.setQtdPorta(4);

		Moto m1 = new Moto();
		m1.setNome("R1");
		m1.setMarca("Yamaha");
		m1.setCilindradas(1000);
		m1.setAno(2012);
		m1.setCor("Azul");

		Aluguel aluguel = new Aluguel();

		List<Veiculo> veiculos = new ArrayList();
		veiculos.add(c1);
		veiculos.add(m1);

		aluguel.setCliente(cliente);
		aluguel.setDataEntrega(new Date(2020, 3, 25));
		aluguel.setDataRetirada(new Date(2020, 3, 22));
		aluguel.setVeiculos(veiculos);

		ClienteDao.save(cliente);
		AluguelDao.save(aluguel);

		System.out.println("Conex ok");
	}
}
