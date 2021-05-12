package lista6objetos;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void movimento () {
		System.out.println("Escalannndo uma árrrrvore...");
	}
}
