package br.com.cactus.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Antonio Ishac
 *
 */
@Controller
public class EstilosController {

	/**
	 * Método que redireciona para realizar um novo cadastro.
	 */
	@RequestMapping("/estilos/novo")
	public String novo() {
		return "estilo/cadastro-estilo";
	}

}
