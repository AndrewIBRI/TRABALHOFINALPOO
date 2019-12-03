package br.com.ufc.testepoo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioSecao {
	
	public static List<Aluno> alunosa=new ArrayList<Aluno>();

	public Aluno getAlunoatual() {
		return alunosa.get(0);
	}

	public void setAlunoatual(Aluno alunoatual) {
		alunosa.add(alunoatual);
	}
	public void removerAlunoatual() {
		alunosa.remove(0);
	}
	

}
