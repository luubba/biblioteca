package Entities;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String nome;
	private int idade;
	private String telefone;
	private String livro;
	
	
	//constructors
	
	public Cliente() {
	}
	
	public Cliente(String nome, int idade, String telefone, String livro) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.livro = livro;
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getLivro() {
		return livro;
	}


	public void setLivro(String livro) {
		this.livro = livro;
	}

	//methods

	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	LocalDateTime data = LocalDateTime.now();



	 public String detalhes() {
			return ("Nome: " + nome + 
					"\nIdade: " + idade +
					"\nTelefone: " + telefone+
					"\nLivro: " + livro +
					"\nData: " + data.format(fmt1));
	}
	
	public void reservarLivro() {
		System.out.println("Reserva efetuada com sucesso!");
		System.out.println(this.detalhes());
	}
}
