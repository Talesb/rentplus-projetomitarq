package br.com.sellcarplus.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sellcarplus.model.negocio.Veiculo;
import br.com.sellcarplus.model.repository.IVeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private IVeiculoRepository veiculoRepository;

	public List<Veiculo> findAll() {
		return (List<Veiculo>) this.veiculoRepository.findAll();
	}

	public Veiculo findById(long id) {
		return this.veiculoRepository.findById(id).get();
	}

	public void delete(long id) {
		this.veiculoRepository.deleteById(id);
	}

	public void save(Veiculo Veiculo) {
		this.veiculoRepository.save(Veiculo);
	}

}
