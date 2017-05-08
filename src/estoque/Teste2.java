package estoque;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Teste2 {

	@Test
	public void test() {
		Sistema sist = new Sistema();
		
		Produto p1 = new Produto("Teclado", 15.50f, 20.50f, 111111, "Teclado comum", 3, LocalDate.of(2017, Month.FEBRUARY, 10));
		Produto p2 = new Produto("Monitor 15 Pol.", 234.90f, 310.50f, 222222, "Monitor LG 15 Polegadas", 5, LocalDate.of(2017, Month.FEBRUARY, 28));
		
		sist.addProduto(p1);
		sist.addProduto(p2);
		
		assertEquals(sist.getProdutos().size(), 2);
		
		Produto produtoBuscado = sist.searchProduto(111111);
		
		assertEquals(sist.getProdutos().get(0).getNome(), "Teclado");
	}

}