package projetoODS;

public class ConsumidorFisico {
	private String nomeConsumidor;
	private String cpf;
	
	public ConsumidorFisico(String nomeConsumidor, String cpf) {
		super();
		this.nomeConsumidor = nomeConsumidor;
		this.cpf = cpf;
	}

	public String getNomeConsumidor() {
		return nomeConsumidor;
	}

	public void setNomeConsumidor(String nomeConsumidor) {
		this.nomeConsumidor = nomeConsumidor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void produtosComprados () {
		
	}

}
