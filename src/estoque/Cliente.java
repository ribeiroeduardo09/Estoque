package estoque;

import java.time.LocalDate;

public class Cliente {
	private String nomecliente;
	private String cpf;
	private String enderecocliente;
	private String telefone;
	private LocalDate datacad;
	
	public Cliente(String nomecliente, String cpf, String enderecocliente, String telefone, LocalDate datacad){
		this.nomecliente = nomecliente;
		this.cpf = cpf;
		this.enderecocliente = enderecocliente;
		this.telefone = telefone;
		this.datacad = datacad;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnderecocliente() {
		return enderecocliente;
	}

	public void setEnderecocliente(String enderecocliente) {
		this.enderecocliente = enderecocliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDatacad() {
		return datacad;
	}

	public void setDatacad(LocalDate datacad) {
		this.datacad = datacad;
	}
	
}
