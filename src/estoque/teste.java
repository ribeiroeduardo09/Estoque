package estoque;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.time.Month;
import org.junit.Test;

public class Teste {
	
	@Test
	public void test() {
		Sistema sist = new Sistema();
		
		/*-----------Fornecedor---------------*/
		
		Fornecedor f1 = new Fornecedor("JK Empreendimentos", 22305372000169L, "contato@jkempreendimentos.com.br", "12 3933-8399", "Rua da Alegria, 447", LocalDate.of(2017, Month.MAY, 12));
		Fornecedor f2 = new Fornecedor("Indústrias Creative Commons", 07712313000111L, "creative@contact.com.br", "13 3447-7577", "Avenida Trindade, 666", LocalDate.of(2017, Month.MAY, 6));
		
		sist.addFornecedor(f1);
		sist.addFornecedor(f2);
		
		assertEquals(sist.getFornecedores().size(), 2);
		
		Fornecedor buscaforn = sist.searchFornecedor(07712313000111L);
		
		assertEquals(buscaforn.getNome(), "Indústrias Creative Commons");
		
		buscaforn = sist.searchFornecedor(22305372000169L);
		
		assertEquals(buscaforn.getNome(), "JK Empreendimentos");
		
		/*-----------Produto---------------*/
		
		Produto p1 = new Produto("Teclado", 15.50f, 20.50f, 111111, "Teclado comum", 3, LocalDate.of(2017, Month.FEBRUARY, 10));
		Produto p2 = new Produto("Monitor 15 Pol.", 234.90f, 310.50f, 222222, "Monitor LG 15 Polegadas", 5, LocalDate.of(2017, Month.FEBRUARY, 28));
		
		
		sist.addProduto(p1);
		sist.addProduto(p2);
		
		assertEquals(sist.getProdutos().size(), 2);
		
		Produto produtoBuscado = sist.searchProduto(111111);
		
		assertEquals(produtoBuscado.getNome(), "Teclado");
		
		/*-----------Usuario---------------*/
		
		sist.addUsuario(new Usuario("Tiago", new DadosLogin("tiagottt", "123"), 123, "Secretario", LocalDate.of(2017, Month.MAY, 12)));
		sist.addUsuario(new Usuario("Felipe", new DadosLogin("felipettt", "456"), 127, "Gerente", LocalDate.of(2017, Month.MAY, 6)));
		
		System.out.println(sist.usuarios);
		
		sist.deletarUsuario("Tiago");
		
		System.out.println(sist.usuarios);
		
		sist.addUsuario(new Usuario("Junior", new DadosLogin("juniorttt", "234"), 345, "Gerente", LocalDate.of(2017, Month.MAY, 6)));
		
		System.out.println(sist.usuarios);
		
		/*-----------Venda---------------*/
		
		Venda v1 = new Venda(3.50f, "Dinheiro", LocalDate.of(2017, Month.APRIL, 10), 001);
		Venda v2 = new Venda(7.50f, "Cartao", LocalDate.of(2017, Month.MAY, 15), 002);
		
		sist.addVenda(v1);
		sist.addVenda(v2);
		
		assertEquals(sist.getVendas().size(), 2);
		
		Venda vendaBuscada = sist.searchVenda(002);
		
		assertEquals(vendaBuscada.getFormapagto(), "Cartao");
		
		/*-----------Historico---------------*/
		
		sist.addHistorico(new Historico(001, LocalDate.of(2017, Month.FEBRUARY, 10)));
		sist.addHistorico(new Historico(002, LocalDate.of(2017, Month.FEBRUARY, 28)));
		
		assertEquals(sist.getHistorico().size(), 2);
		
		Historico historicoBuscado = sist.searchHistorico(002);
		
		assertEquals(historicoBuscado.getDataAcao(), LocalDate.of(2017, Month.FEBRUARY, 28));
		
		/*-----------Administrador---------------*/
		
		sist.addAdmin(new Administrador("Eduardo", "Di Nizo", new DadosLogin("edu_nizo", "engenharia")));
		sist.addAdmin(new Administrador("Roberto", "Dantas", new DadosLogin("ro_dantas", "mecanico")));
		
		System.out.println(sist.admin);
		
		sist.deletarAdministrador("edu_nizo");
		
		System.out.println(sist.admin);
		
		sist.addAdmin(new Administrador("Roberto", "Dantas", new DadosLogin("ro_dantas", "mecanico")));
		
		System.out.println(sist.admin);
		
		/*-----------Cliente---------------*/
		
		//adicionando o cliente e todos os seus dados em clientes
		Cliente c1 = new Cliente(001, "Danielle", "111111111-11", "Rua 1", "3333-5555", LocalDate.of(2017, Month.MAY, 22));
		Cliente c2 = new Cliente(002, "Eduardo", "222222222-22", "Rua 2", "4444-6666", LocalDate.of(2016, Month.APRIL, 21));
		Cliente c3 = new Cliente(003, "Danielle", "333333333-33", "Rua 3", "7777-5555", LocalDate.of(1998, Month.MAY, 25));
		
		
		//incluindo o cliente adicionado na classe sistema
		sist.addCliente(c1);
		sist.addCliente(c2);
		sist.addCliente(c3);
		
		//buscandoo cliente pelo código 
		Cliente clienteBuscado = sist.searchCliente(001);
		//Cliente clienteBuscado = sist.searchCliente(003);
		
		
		//verificando quantos cadastros de clientes existem
		assertEquals(sist.getClientes().size(), 3);
		
		assertEquals(clienteBuscado.getNomecliente(), "Danielle");
				
		/*-----------Compra---------------*/
		
		Compra co1 = new Compra(200.00f, LocalDate.of(2017,Month.DECEMBER, 10), 001);
		Compra co2 = new Compra(300.00f, LocalDate.of(2017,Month.DECEMBER, 10), 002);
		
		sist.addCompra(co1);
		sist.addCompra(co2);
		
		Compra compraBuscada = sist.searchCompra(001);
		//Compra compraBuscada = sist.searchCompra(002);
		
		assertEquals(sist.getCompras().size(),2);
		
		assertEquals(compraBuscada.getDatacompra(), LocalDate.of(2017,Month.DECEMBER, 10));	
		
	}

}
