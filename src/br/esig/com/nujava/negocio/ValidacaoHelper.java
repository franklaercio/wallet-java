package br.esig.com.nujava.negocio;

import br.esig.com.nujava.dominio.Conta;
import br.esig.com.nujava.dominio.Instituicao;

/** Esta entendidade valida os dados da {@link Conta}.
 * 
 * @author Frank Laércio
 * @version 1.0
 * @since 25/02/2021
 */
public class ValidacaoHelper {
	
	public static boolean isPossivelCadastrarConta(Conta conta) {
		if(!verificarDadosPessoa(conta) 
				|| !verificarDadosInstituicao(conta.getInstituicao())) {
			System.out.println("Não foi possível cadastrar a conta!");
			return false;
		}
		
		return true;
	}
	
	public static boolean verificarDadosPessoa(Conta conta) {
		if(conta == null) {
			System.out.println("Conta não foi preenchida.");
			
			return false;
		}
		
		if(conta.getNome().isEmpty()) {
			System.out.println("Nome não foi preenchido.");
			
			return false;
		}
		
		if(conta.getCpf().isEmpty()) {
			System.out.println("CPF não foi preenchido.");
			
			return false;
		}
		
		if(conta.getGenero().isEmpty()) {
			System.out.println("Gênero não foi preenchido.");
			
			return false;
		}
		
		if(conta.getDataNascimento() == null) {
			System.out.println("Data de Nascimento não foi preenchido.");
			
			return false;
		}
		
		if(conta.getNumero().isEmpty()) {
			System.out.println("Nº da Conta não foi preenchido.");
			
			return false;
		}
		
		return true;
	}
	
	public static boolean verificarDadosInstituicao(Instituicao instituicao) {
		return instituicao != null && !instituicao.getCnpj().isEmpty();
	}
}
