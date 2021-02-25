package br.esig.com.nujava.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import br.esig.com.nujava.dominio.Conta;
import br.esig.com.nujava.dominio.Genero;
import br.esig.com.nujava.negocio.ValidacaoHelper;

/** Esta entendidade testa as validações da {@link Conta}.
 * 
 * @author Frank Laércio
 * @version 1.0
 * @since 25/02/2021
 */
public class ValidacaoHelperTest {

	@Test
	public void testDeveCadastrarContaComTodosDados() {
		Conta conta = new Conta();
		conta.setNome("Teste");
		conta.setCpf("111-111-111-11");
		conta.setGenero(Genero.modificarStringToGenero("Masculino"));
		conta.setDataNascimento(new Date());
		conta.setNumero("000000-0");
		
		assertTrue(ValidacaoHelper.isPossivelCadastrarConta(conta));
	}
	
	@Test
	public void testNaoDeveCadastrarContaComTodosDados() {
		Conta conta = null;
		
		assertFalse(ValidacaoHelper.isPossivelCadastrarConta(conta));
	}

}
