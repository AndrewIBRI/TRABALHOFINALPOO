package br.com.ufc.testepoo;

import java.util.ArrayList;
import java.util.List;

public class Acervo {
	static List<Livro> Acervos = new ArrayList<Livro>();

	public static Livro getAcervos(int i) {
		return Acervos.get(i);
	}

	public static void setAcervos(Livro livro) {
		Acervos.add(livro);
	}
	public static int tamanho() {
		return Acervos.size();
	}
	public static void remover(int i) {
		Acervos.remove(i);
	}
	public static void setEmprestimo(int i,Aluno aluno) {
		Acervos.get(i).setAlugado("Sim");
		Acervos.get(i).setTempo(30);
	}
	public static void renovar(String tostring) {
		for(int i = 0;i<Acervos.size(); i++) {
			if(Acervos.get(i).toString().equals(tostring)) {
				Acervos.get(i).setTempo(Acervos.get(i).getTempo()+7);;
			}
		}
	}
	public static void setDevolucao(String tostring) {
		for(int i = 0;i<Acervos.size(); i++) {
			if(Acervos.get(i).toString().equals(tostring)) {
				Acervos.get(i).setAlugado("Nao");
				Acervos.get(i).setTempo(0);
			}
		}
	}
	
	
}
