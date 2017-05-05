package estoque;

import java.util.LinkedList;
import java.util.List;

public class Sistema {
	
	private List<Produto> produtos = new LinkedList<Produto>();
	private List<Cliente> clientes = new LinkedList<Cliente>();
	private List<Fornecedor> fornecedores = new LinkedList<Fornecedor>();
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Venda> vendas = new LinkedList<Venda>();
	private List<Compra> compras = new LinkedList<Compra>();
	
	
	public void addProduto(Produto prod){
		produtos.add(prod);
	}
	public void delProduto(int codigoproduto){
		for(Produto prod:produtos){
			if(prod.getCodigoproduto()==codigoproduto) produtos.remove(prod);
		}
	}
	public void addUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
	public void addCliente(Cliente cliente){
		clientes.add(cliente);
	}
	public void addFornecedor(Fornecedor fornecedor){
		fornecedores.add(fornecedor);
	}
	public void addCompra(Compra compra){
		compras.add(compra);
	}
	public void addVenda(Venda venda){
		vendas.add(venda);
	}
	public Produto searchProduto(int codigoproduto){
		for(Produto prod:produtos){
			if(prod.getCodigoproduto() == codigoproduto) return prod;
		} 
		return null;
	}
	//Getters & Setters
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Venda> getVendas() {
		return vendas;
	}
	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

}
