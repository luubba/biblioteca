package Program;

import Entities.Cliente;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(
				"-------------------------"
				+"\n  SEJA BEM VINDO!"
				+"\n-------------------------");
		System.out.println("Você deseja entrar na área de:"
							+ "\n1. Clientes"
							+ "\n2. Colaboradores");
		int option = sc.nextInt();
		sc.nextLine();
		
		switch (option) {
		
		case 1:
			
			System.out.println("Vamos reservar seu livro!");
			System.out.println("Vamos precisar de alguns dados seus, okay?");
			System.out.println();
			
			System.out.println("Como você gostaria de ser chamado?");
			String nome = sc.nextLine();
			System.out.println();
			
			System.out.println("Quantos anos você tem?");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			System.out.println("Insira seu telefone de contato no formato (ddd)9xxxx-xxxx");
			String telefone = sc.nextLine();
			System.out.println();
			
			System.out.println("Digite o nome do livro desejado: ");
			String livro = sc.nextLine();
			System.out.println();
			System.out.println();
			
			Cliente[] cl = new Cliente[10];
			cl[0] = new Cliente(nome, idade, telefone, livro);
			
			cl[0].reservarLivro();
			
			System.out.println();
			
			break;
			
			
		case 2:
			break;
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
 
}
