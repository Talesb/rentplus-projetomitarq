package br.com.sellcarplus.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sellcarplus.model.negocio.Venda;
import br.com.sellcarplus.model.repository.IVendaRepository;

@Service
public class VendaService {

	@Autowired
	private IVendaRepository vendaRepository;

	public List<Venda> findAll() {
		return (List<Venda>) this.vendaRepository.findAll();
	}

	public Venda findById(long id) {
		return this.vendaRepository.findById(id).get();
	}

	public void delete(long id) {
		this.vendaRepository.deleteById(id);
	}

	public void save(Venda Venda) {
		this.vendaRepository.save(Venda);
	}

}
