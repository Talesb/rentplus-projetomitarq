package br.com.sellcarplus.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sellcarplus.model.negocio.Veiculo;

@Repository
public interface IVeiculoRepository extends CrudRepository<Veiculo, Long> {

}
