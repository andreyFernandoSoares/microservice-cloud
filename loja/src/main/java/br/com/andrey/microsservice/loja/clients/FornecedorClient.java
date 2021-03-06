package br.com.andrey.microsservice.loja.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.andrey.microsservice.loja.dto.InfoFornecedorDTO;
import br.com.andrey.microsservice.loja.dto.InfoPedidoDTO;
import br.com.andrey.microsservice.loja.dto.ItensDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	@GetMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);
	
	@PostMapping("/pedido")
	InfoPedidoDTO realizaPedido(List<ItensDTO> itens);
}
