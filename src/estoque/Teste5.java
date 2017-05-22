package estoque;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Teste5 {

	@Test
	public void test() {
		//instanciando a classe sistema para fazer as inclusões
		Sistema sist = new Sistema();
		
		
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
		
		//verificando se o cliente buscado é o mesmo abaixo
		assertEquals(sist.getClientes().nomecliente("Danielle").size(), 2);
		assertEquals(((Cliente) sist.getClientes()).getNomecliente("Danielle"));
		
			
				
	}

}
