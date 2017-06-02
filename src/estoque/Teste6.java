package estoque;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Teste6 {

	@Test
	public void test() {
		Sistema sist = new Sistema();
		
		/*-----------Historico---------------*/
		
		Historico h1 = new Historico("Teclado", 15.50f, 20.50f, 111111, "Teclado comum", 3, LocalDate.of(2017, Month.FEBRUARY, 10));
		Historico h2 = new Historico("Monitor 15 Pol.", 234.90f, 310.50f, 222222, "Monitor LG 15 Polegadas", 5, LocalDate.of(2017, Month.FEBRUARY, 28));
		
		
		sist.addHistorico(h1);
		sist.addHistorico(h2);
		
		assertEquals(sist.getHistorico().size(), 2);
		
		Produto produtoBuscado = sist.searchHistorico(111111);
		
		assertEquals(produtoBuscado.getNome(), "Teclado");
		
		/*-----------Administrador---------------*/
		
		sist.addAdmin(new Administrador("Eduardo", "Di Nizo", new DadosLogin("edu_nizo", "engenharia")));
		sist.addAdmin(new Administrador("Roberto", "Dantas", new DadosLogin("ro_dantas", "mecanico")));
		
		System.out.println(sist.admin);
		
		sist.deletarAdministrador("edu_nizo");
		
		System.out.println(sist.admin);
		
		sist.addAdmin(new Administrador("Roberto", "Dantas", new DadosLogin("ro_dantas", "mecanico")));
		
		System.out.println(sist.admin);
	}

}
