package lista6objetos;

public class Animal {
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe
	Animal:*/
	
	//atributos
	private String nome;
	private int idade;
	
	//construtor

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//encapsulamentos

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
	
	//metodos
	
	public void som() {
		System.out.println("Emitindo som...");
	}
	
	public void movimento () {
		System.out.println("Correndo!");
	}
}
