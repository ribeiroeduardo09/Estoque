package estoque;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Historico {

	private List<Produto> produtos = new LinkedList<Produto>();
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Venda> vendas = new LinkedList<Venda>();
	private List<Compra> compras = new LinkedList<Compra>();
	private List<Fornecedor> fornecedores = new LinkedList<Fornecedor>();
	private List<Cliente> clientes = new LinkedList<Cliente>();
	
	private LocalDate dataAcao;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Usuario> getUsuario() {
		return usuarios;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuarios = usuario;
	}

	public List<Venda> getVenda() {
		return vendas;
	}

	public void setVenda(List<Venda> venda) {
		this.vendas = venda;
	}

	public List<Compra> getCompra() {
		return compras;
	}

	public void setCompra(List<Compra> compra) {
		this.compras = compra;
	}

	public List<Fornecedor> getFornecedor() {
		return fornecedores;
	}

	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedores = fornecedor;
	}

	public List<Cliente> getCliente() {
		return clientes;
	}

	public void setCliente(List<Cliente> cliente) {
		this.clientes = cliente;
	}

	public LocalDate getDataAcao() {
		return dataAcao;
	}

	public void setDataAcao(LocalDate dataAcao) {
		this.dataAcao = dataAcao;
	}
	
	public void addProduto (Produto produto){
		produtos.add(produto);
	}
	
	public void addUsuario (Usuario usuario){
		usuarios.add(usuario);
	}
	
	public void addVenda (Venda venda){
		vendas.add(venda);
	}
	
	public void addCompra (Compra compra){
		compras.add(compra);
	}
	
	public void addFornecedor (Fornecedor fornecedor){
		fornecedores.add(fornecedor);
	}
	
	public void addCliente (Cliente cliente){
		clientes.add(cliente);
	}
	
		
	public void delProduto(int codigoproduto){
		for(Produto prod:produtos){
			if(prod.getCodigoproduto()==codigoproduto) produtos.remove(prod);
		}
	}
	
	public void delUsuario(int matricula){
		for(Usuario usuario:usuarios){
			if(usuario.getMatricula()==matricula) usuarios.remove(matricula);
		}
	}
	
	public void delVenda(int codigo){
		for(Venda venda:vendas){
			if(venda.getCodigo()==codigo) vendas.remove(codigo);
		}
	}
	
	public void delCompra(int codigoCompra){
		for(Compra compra:compras){
			if(compra.getCodigocompra()==codigoCompra) compras.remove(codigoCompra);
		}
	}
	
	public void delFornecedor(int cnpj){
		for(Fornecedor forn:fornecedores){
			if(forn.getCnpj()== cnpj) fornecedores.remove(cnpj);
		}
	}
	
	public void delCliente(String cpf){
		for(Cliente cliente:clientes){
			if(cliente.getCpf()== cpf) clientes.remove(cpf);
			}
		}
	
	
	
}
