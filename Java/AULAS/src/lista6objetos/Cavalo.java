package lista6objetos;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void som () {
		System.out.println("riiiihiiihihóinnn");
	}

}
