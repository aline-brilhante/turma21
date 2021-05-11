package lista5objetos;

public class ClienteObjeto {

	public String nome;
	public String cpf;
	public double mes1;
	public double mes2;
	
	public void totalCompras () {
		System.out.println("\nTotal gasto em compras: R$" + (mes1 + mes2));
	}
	
	public void mostraNome () {
		System.out.println("\nNome do cliente: " + nome);
	}
	public void mostraCpf () {
		System.out.println("\nCPF:" + cpf);
	}
	
}
