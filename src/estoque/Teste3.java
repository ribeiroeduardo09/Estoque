package estoque;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Teste3 {

	@Test
	public void test() {
		Sistema sist = new Sistema();
		
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
	}

}
