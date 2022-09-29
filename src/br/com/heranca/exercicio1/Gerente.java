package br.com.heranca.exercicio1;

public class Gerente extends Funcionario{
	String senha;
	int tempoNaEmpresa;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTempoNaEmpresa() {
		return tempoNaEmpresa;
	}
	public void setTempoNaEmpresa(int tempoNaEmpresa) {
		this.tempoNaEmpresa = tempoNaEmpresa;
	}	
	
}