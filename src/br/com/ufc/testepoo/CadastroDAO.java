package br.com.ufc.testepoo;

import java.util.ArrayList;
import java.util.List;

public class CadastroDAO {
	private static List<Aluno> AlunosCadastrados = new ArrayList<Aluno>();
	
	public static void setAlunos(Aluno aluno) {
		AlunosCadastrados.add(aluno);
	}
	public static Aluno getAluno(int i) {
		return AlunosCadastrados.get(i);
	}
	public static int tamanho () {
		return AlunosCadastrados.size();
	}

}
