package br.com.andrey.microsservice.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andrey.microsservice.loja.dto.CompraDTO;
import br.com.andrey.microsservice.loja.models.Compra;
import br.com.andrey.microsservice.loja.services.CompraService;

@RestController
@RequestMapping("/compra")
public class LojaController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping
	public Compra realizaCompra(@RequestBody CompraDTO compra) {
		return compraService.realizaCompra(compra);
	}
	
	@GetMapping("/{id}")
	public Compra getById(@PathVariable("id") Long id) {
		return compraService.getById(id);
	}
}
