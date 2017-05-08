package estoque;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Venda {
	private Float valortotal;
	private String formapagto;
	private LocalDate datavenda;
	private String codigo;
	private List produtos = new LinkedList<Produto>();
	
	public Venda(Float valortotal, String formapagto, LocalDate datavenda, String codigo, List produtos){
		this.valortotal = valortotal;
		this.formapagto = formapagto;
		this.datavenda = datavenda;
		this.codigo = codigo;
		this.produtos = produtos;
	}

	public Float getValortotal() {
		return valortotal;
	}

	public void setValortotal(Float valortotal) {
		this.valortotal = valortotal;
	}

	public String getFormapagto() {
		return formapagto;
	}

	public void setFormapagto(String formapagto) {
		this.formapagto = formapagto;
	}

	public LocalDate getDatavenda() {
		return datavenda;
	}

	public void setDatavenda(LocalDate datavenda) {
		this.datavenda = datavenda;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List getProdutos() {
		return produtos;
	}

	public void setProdutos(List produtos) {
		this.produtos = produtos;
	}
	
	
}
