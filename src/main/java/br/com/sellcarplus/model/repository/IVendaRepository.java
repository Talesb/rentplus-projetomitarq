package br.com.sellcarplus.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sellcarplus.model.negocio.Venda;

@Repository
public interface IVendaRepository extends CrudRepository<Venda, Long> {

}
