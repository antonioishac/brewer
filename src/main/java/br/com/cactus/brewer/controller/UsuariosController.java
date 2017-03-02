package br.com.cactus.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Antonio Ishac
 *
 */
@Controller
public class UsuariosController {

	@RequestMapping("/usuarios/novo")
	public String novo() {
		return "usuario/cadastro-usuario";
	}

}
