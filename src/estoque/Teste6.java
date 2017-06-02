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
	}

}
