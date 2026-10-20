package exercicio8;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Aluno[] vetAluno = new Aluno[5];

		LinkedList<Aluno> fila = new LinkedList<Aluno>();
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome do aluno " + (i + 1) + ":");
			String nome = entrada.nextLine();

			System.out.println("Informe a idade do aluno " + (i + 1) + ":");
			int idade = entrada.nextInt();
			entrada.nextLine();

			Aluno aluno = new Aluno(nome, idade);
			fila.add(aluno);
		}

		fila.poll();

		System.out.println("Alunos que permanecem na fila");
		for (Aluno a : fila) {

			System.out.println(a.getNome());
		}

		entrada.close();
	}

}
