package projetoODS;

public class ONGs {

	private String nomeInstituicao;
	private double cnpj;
	private double descontoOng;
	
	public ONGs(String nomeInstituicao, double cnpj, double descontoOng) {
		super();
		this.nomeInstituicao = nomeInstituicao;
		this.cnpj = cnpj;
		this.descontoOng = descontoOng;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public double getDescontoOng() {
		return descontoOng;
	}

	public void setDescontoOng(double descontoOng) {
		this.descontoOng = descontoOng;
	}
	
	public void produtosRecebidos () {
		
	}

}
