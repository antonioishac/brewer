package br.com.cactus.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Antonio Ishac
 *
 */
@Controller
public class ClientesController {

	@RequestMapping("/clientes/novo")
	public String novo() {
		return "cliente/cadastro-cliente";
	}

}
