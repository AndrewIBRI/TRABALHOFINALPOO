package br.com.ufc.testepoo;

public class Livro {
	
	private String titulo;
	private String autor;
	private String descricao;
	private String isbn;
	private String alugado;
	private Aluno alunoaluga;
	private int tempo;
	
	public Aluno getAlunoaluga() {
		return alunoaluga;
	}
	public void setAlunoaluga(Aluno alunoaluga) {
		this.alunoaluga = alunoaluga;
	}
	public String getAlugado() {
		return alugado;
	}
	public void setAlugado(String alugado) {
		this.alugado = alugado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Livro(String titulo, String autor, String descricao, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.descricao = descricao;
		this.isbn = isbn;
		this.alugado="Nao";
		this.alunoaluga=null;
		this.tempo=0;
	}
	@Override
	public String toString() {
		return "Titulo:" + titulo + ", Autor:" + autor + ", Alugado:" + alugado + ", Dias Restantes:"+ tempo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	

}
