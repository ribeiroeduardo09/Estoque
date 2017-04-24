package estoque;

import java.time.LocalDate;

public class Produto {
	
	private String nome;
	private Float valorcompra;
	private Float valorvenda;
	private int codigoproduto;
	private String descricao;
	private int quantidade;
	private LocalDate datacad;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValorcompra() {
		return valorcompra;
	}
	public void setValorcompra(Float valorcompra) {
		this.valorcompra = valorcompra;
	}
	public Float getValorvenda() {
		return valorvenda;
	}
	public void setValorvenda(Float valorvenda) {
		this.valorvenda = valorvenda;
	}
	public int getCodigoproduto() {
		return codigoproduto;
	}
	public void setCodigoproduto(int codigoproduto) {
		this.codigoproduto = codigoproduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDatacad() {
		return datacad;
	}
	public void setDatacad(LocalDate datacad) {
		this.datacad = datacad;
	}
	
	

}
