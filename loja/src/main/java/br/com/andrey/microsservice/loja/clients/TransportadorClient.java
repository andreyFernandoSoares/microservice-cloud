package br.com.andrey.microsservice.loja.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.andrey.microsservice.loja.dto.EntregaDTO;
import br.com.andrey.microsservice.loja.dto.VoucherDTO;

@FeignClient("transportador")
public interface TransportadorClient {
	
	@PostMapping("/entrega")
	public VoucherDTO reservaEntrega(EntregaDTO entrega);
}
