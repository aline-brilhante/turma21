package lista6objetos;

public class Cavalo extends Animal {

	public String Relincha;
	public String Corre;
	
	
	public Cavalo(String nome, int idade, String relincha, String corre) {
		super(nome, idade);
		Relincha = relincha;
		Corre = corre;
	}


	public String getRelincha() {
		return Relincha;
	}


	public void setRelincha(String relincha) {
		Relincha = relincha;
	}


	public String getCorre() {
		return Corre;
	}


	public void setCorre(String corre) {
		Corre = corre;
	}
	
	public String getNome() {
		return "Nome do cavalo: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nBarulho do animal: "+this.getRelincha()+"\nMovimento: "+this.getCorre();
	}
	
	
}
