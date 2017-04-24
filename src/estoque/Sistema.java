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

}
