package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	/*
	 * Pelo amor de deus, o nome do mapping, do método, da string de retorno
	 * e o nome do arquivo .html tem que ser exatamente iguais senão dá erro*/
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("capitulo", "Prologue I: ");
		return "hello";
	}
}
