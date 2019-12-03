package br.com.ufc.testepoo;

public class Aluno {
	
	
	
	
	private String nome;
	private String matricula;
	private String curso;
	private String cpf;
	private String nascimento;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public Aluno(String nome, String matricula, String curso, String cpf, String nascimento) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}


	
}
