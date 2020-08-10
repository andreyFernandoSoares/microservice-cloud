package br.com.andrey.microsservice.fornecedor.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.andrey.microsservice.fornecedor.models.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
