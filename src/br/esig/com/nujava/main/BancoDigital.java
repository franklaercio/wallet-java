package br.esig.com.nujava.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

import br.esig.com.nujava.dominio.Conta;
import br.esig.com.nujava.dominio.Genero;
import br.esig.com.nujava.negocio.ValidacaoHelper;

/** Esta é a entidade que gerencia uma conta digital.
 * 
 * @author Frank Laércio
 * @since 25/02/2021
 * @version 1.0
 */
public class BancoDigital {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Conta conta = new Conta();
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.print("Informe o nome da pessoa: ");
			conta.setNome(teclado.nextLine());
			
			System.out.print("Informe o cpf da pessoa: ");
			conta.setCpf(teclado.nextLine());
			
			System.out.print("Informe o genêro da pessoa (Masculino ou Feminino): ");
			conta.setGenero(Genero.modificarStringToGenero(teclado.nextLine()));
			
			System.out.print("Informe a data de nascimento da pessoa: ");
			String dataNascimento = teclado.nextLine();
			
			if(!dataNascimento.isEmpty()) {
				conta.setDataNascimento(simpleDateFormat.parse(dataNascimento));
			}
			
			conta.setNumero("XXXXXX");
			
			if(ValidacaoHelper.isPossivelCadastrarConta(conta)) {
				System.out.println("Nome: " + conta.getNome());
				System.out.println("CPF: " + conta.getCpf());
				System.out.println("Gênero: " + Genero.getNomeGenero(conta.getGenero().getGenero()));
				System.out.println("Data de Nascimento: " + simpleDateFormat.format(conta.getDataNascimento()));
				System.out.println("Banco: " + conta.getInstituicao().getNome());
				System.out.println("Agência: " + conta.getInstituicao().getCodigo());
				System.out.println("Nº da Conta: " + conta.getNumero());
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			teclado.close();
		}
	}

}
