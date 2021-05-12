package lista6objetos;

public class Preguica extends Animal {
	
	private String som;
	private String escalar;
	public Preguica(String nome, int idade, String som, String escalar) {
		super(nome, idade);
		this.som = som;
		this.escalar = escalar;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getEscalar() {
		return escalar;
	}
	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	

	public String getNome() {
		return "Nome da preguiça: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nBarulho do animal: "+this.getSom()+"\nMovimento: "+this.getEscalar();
	}
	

}
