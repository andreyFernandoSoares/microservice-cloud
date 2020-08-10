package br.com.andrey.microsservice.fornecedor.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.andrey.microsservice.fornecedor.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
