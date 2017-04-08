package Exercicio5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class TesteBancoAgencia {
	
	@Test
	public void BancodoBrasil() throws Exception{
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco bancoDoBrasil = sistemaBancario.criarBanco ("Banco do Brasil", Moeda.BRL);
		
		Agencia bbTrindade = bancoDoBrasil.criarAgencia ("Trindade");
		
		assertEquals("001", bbTrindade.obterIdentificador());
		assertEquals ("Trindade", bbTrindade.obterNome());
		assertEquals(bancoDoBrasil, bbTrindade.obterBanco());
	}

	@Test
	public void  
}
