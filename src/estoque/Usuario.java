package estoque;

import java.time.LocalDate;

public class Usuario {
	
	private String nomeusuario;
	private DadosLogin dados;
	private int matricula;
	private String cargo;
	private LocalDate datacadastro;
	
	public Usuario(String nomeusuario, DadosLogin dados, int matricula, String cargo, LocalDate datacadastro){
		this.nomeusuario = nomeusuario;
		this.dados = dados;
		this.matricula = matricula;
		this.cargo = cargo;
		this.datacadastro = datacadastro;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public DadosLogin getDados()
	{
		return dados;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(LocalDate datacadastro) {
		this.datacadastro = datacadastro;
	}

}
