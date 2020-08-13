package br.com.andrey.microsservice.loja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.andrey.microsservice.loja.models.Compra;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long>{

}
