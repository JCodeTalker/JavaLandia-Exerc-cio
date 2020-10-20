package contribuintes;

import java.time.LocalDate;

public class Contribuinte {
	
	
	
	public Contribuinte(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.status = status;
		this.taxaContribuicao = taxaContribuicao;
		this.salario = salario;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getTaxaContribuicao() {
		return taxaContribuicao;
	}

	public void setTaxaContribuicao(double taxaContribuicao) {
		this.taxaContribuicao = taxaContribuicao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	private String nome;
	private String cpf;
	private LocalDate dataAdmissao;
	private boolean status;
	private double taxaContribuicao;
	private double salario;
	
	
	
	public double calcularContribuicao () {
		return salario * taxaContribuicao;
	}
	
	public String imprimirContribuicaoMensal () {
		String resultado = "A contribuição mensal de " + this.nome + " é de R$" + this.calcularContribuicao();
		return resultado;
	}
}
