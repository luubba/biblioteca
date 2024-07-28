package Program;

import Entities.Cliente;
import Entities.Colaboradores;
import Entities.Livro;
import Entities.storage;
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

			Cliente cl = new Cliente(nome, idade, telefone);
			cl.addCliente(cl);

			System.out.println("Digite o nome do livro desejado: ");

			String livroCliente = sc.nextLine();

			if (storage.verificarLivro(livroCliente)== true){
			System.out.println("Verificando no disponibilidade no sistema...");
			cl.reservarLivro();
			} else {
				System.out.println("Livro não disponível.");
			}


			break;
			
			
		case 2:

			System.out.println("Seja bem vindo, colaborador!");
			System.out.println("Digite seu nome: ");
			String name = sc.nextLine();

			Colaboradores clb = new Colaboradores();
			

		 	System.out.println(
			"O que deseja fazer a seguir?"
			+"\n\n1. Cadastrar entrega de livro."
			+ "\n2. Cadastrar aluguel de livro"
			+ "\n3. Adicionar livros ao estoque");

			int option2 = sc.nextInt();
			sc.nextLine();

			switch (option2){

				case 1:
					System.out.println("Digite o nome do livro:");
					String livroEntregue = sc.nextLine();
					System.out.println("Digite o nome do autor:");
					String autorEntregue = sc.nextLine();
					Livro livro = new Livro(livroEntregue, autorEntregue);
					
				break;

				case 2:
				System.out.println("Digite o nome do livro:");
				String livroAlugar = sc.nextLine();
				System.out.println("Verificando disponibilidade no sistema...");

				 if (storage.verificarLivro(livroAlugar) == true){

					System.out.println("Verificando no disponibilidade no sistema...");
					} else {
						System.out.println("Livro não disponível.");
					}
				break;

				case 3:
				System.out.println("Digite o nome do livro");
				String livroNome = sc.nextLine();

				System.out.println("Digite o nome do Autor");
				String autor = sc.nextLine();

				Livro livro1 = new Livro(livroNome, autor);
				
				storage.addLivro(livro1);

				
				



				break;
			}

			
		break;
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
 
}
