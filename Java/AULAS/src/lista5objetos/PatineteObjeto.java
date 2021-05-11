package lista5objetos;

public class PatineteObjeto {

	public int rodas;
	public boolean guidao;
	public double distancia;
	public double tempo;
	public String cor;
	public boolean motor;
	
	public void velocidade () {
		System.out.println("\nVelocidade: " + (distancia/tempo) + "km/h");	
	}
}
