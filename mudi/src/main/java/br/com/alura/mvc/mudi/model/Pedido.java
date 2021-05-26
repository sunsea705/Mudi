package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeProduto;
	private BigDecimal valorNegociado = BigDecimal.ZERO;
	private LocalDate dataEntrega = LocalDate.now();
	private String urlProduto;
	private String urlImagem;
	private String descricao;

	@Enumerated(EnumType.STRING)
	private StatusPedido status;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<Oferta> ofertas;

	public Pedido() {
	}

	public Pedido(String nomeProduto, BigDecimal valorNegociado, String urlProduto, String urlImagem,
			String descricao) {
		this.nomeProduto = nomeProduto;
		this.valorNegociado = valorNegociado;
		this.dataEntrega = LocalDate.now();
		this.urlProduto = urlProduto;
		this.urlImagem = urlImagem;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}

	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Oferta> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

}
