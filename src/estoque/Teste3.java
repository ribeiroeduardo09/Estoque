package estoque;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Teste3 {

	@Test
	public void test() {
		Sistema sist = new Sistema();
		
		Produto p1 = new Produto("Teclado", 15.50f, 20.50f, 111111, "Teclado comum", 3, LocalDate.of(2017, Month.FEBRUARY, 10));
		Produto p2 = new Produto("Monitor 15 Pol.", 234.90f, 310.50f, 222222, "Monitor LG 15 Polegadas", 5, LocalDate.of(2017, Month.FEBRUARY, 28));
		
		
		sist.addProduto(p1);
		sist.addProduto(p2);
		
		assertEquals(sist.getProdutos().size(), 2);
		
		Produto produtoBuscado = sist.searchProduto(111111);
		
		assertEquals(produtoBuscado.getNome(), "Teclado");
		
		/*-----------Fornecedor---------------*/
		
		Fornecedor f1 = new Fornecedor("JK Empreendmentos", 22305372000169L, "contato@jkempreendimentos.com.br", "12 3933-8399", "Rua da Alegria, 447", LocalDate.of(2017, Month.MAY, 12));
		Fornecedor f2 = new Fornecedor("Indústrias Creative Commons", 07712313000111L, "creative@contact.com.br", "13 3447-7577", "Avenida Trindade, 666", LocalDate.of(2017, Month.MAY, 6));
		
		sist.addFornecedor(f1);
		sist.addFornecedor(f2);
		
		assertEquals(sist.getFornecedores().size(), 2);
		
		Fornecedor buscaforn = sist.searchFornecedor(07712313000111L);
		
		assertEquals(buscaforn.getNome(), "Indústrias Creative Commons");
		
	}

}
