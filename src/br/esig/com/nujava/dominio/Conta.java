package br.esig.com.nujava.dominio;

/** Esta entendidade representa uma Conta.
 * 
 * Uma conta deve ser ligada apenas uma {@link Pessoa}. <p><br />
 * Quem regulamenta a conta é a {@link Instituicao}. <p><br />
 * 
 * @author Frank Laércio
 * @since 25/02/2021
 * @version 1.0
 */
public class Conta extends Pessoa {
	private Instituicao instituicao;
	
	private String numero;
	
	private boolean ativa;
	
	private Double saldo;
	
	public Conta() {
		this.instituicao = new Instituicao();
		this.saldo = 0.0;
		this.ativa = Boolean.TRUE;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
