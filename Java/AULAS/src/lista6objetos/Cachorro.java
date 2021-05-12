package lista6objetos;

public class Cachorro extends Animal {

	private String latido;
	private String corre;
	
	public Cachorro(String nome, int idade, String latido, String corre) {
		super(nome, idade);
		this.latido = latido;
		this.corre = corre;
	}

	public String getLatido() {
		return latido;
	}

	public void setLatido(String latido) {
		this.latido = latido;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}


	public String getNome() {
		return "Nome do cachorro: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nBarulho do animal: "+this.getLatido()+"\nMovimento: "+this.getCorre();
	}
	
}
