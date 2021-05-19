package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	/*
	 * A string de retorno e o nome do arquivo .html tem que ser exatamente iguais senão dá erro*
	 * Então sim, o endereço para acessar esse método pode ser diferente, conforme o exemplo aí embaixo.
	 */
	@GetMapping("/hell")
	public String hello(Model model) {
		model.addAttribute("capitulo", "Prologue I: ");
		return "hello";
	}
}
