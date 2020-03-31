package br.com.sellcarplus.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sellcarplus.model.negocio.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}
