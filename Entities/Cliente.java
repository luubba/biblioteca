package Entities;

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
	 public String detalhes() {
			return ("Nome: " + nome + 
					"\nIdade: " + idade +
					"\nTelefone: " + telefone+
					"\nLivro: " + livro);
	}
	
	public void reservarLivro() {
		System.out.println("O livro " + livro + " foi reservado com sucesso!");
		//incluir uma validação de data no momento que o cliente reservar o livro
	}
}
