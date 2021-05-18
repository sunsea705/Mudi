package br.com.alura.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller	
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		/*
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("MASTER SYSTEM EVOLUTION COM 132 JOGOS NA MEMÓRIA");
		pedido.setUrlImagem("https://dtzhc0rw447zs.cloudfront.net/Custom/Content/Products/01/86/0186_master-system-evolution-com-132-jogos-na-memoria-995020351822_z5_637396510844112706.png");
		pedido.setValorNegociado(new BigDecimal("249.96"));
		pedido.setUrlProduto("https://www.tectoy.com.br/master-system-evolution-com-132-jogos-na-memoria-995020351822-p186");
		pedido.setDescricao("Direto do túnel do tempo, uma reedição do Master System no formato plug and play.");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		*/
		
		model.addAttribute("pedidos", pedidoRepository.findAll());
		
		return "home";
	}
}