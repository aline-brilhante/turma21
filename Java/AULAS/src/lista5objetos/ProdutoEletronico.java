package lista5objetos;

public class ProdutoEletronico {
	
	public String produto;
	public String bateria;
	public boolean usb;
	public boolean wifi;
	public double preco;
	public boolean disponivel;

	public void mostraPreco() {
		System.out.println("\nPreço: R$" + preco);
	}
	public void mostraProduto() {
		System.out.println("\nTipo: " + produto);
	}
	public void mostraBateria() {
		System.out.println("\nTipo: " + bateria);
	}

}
