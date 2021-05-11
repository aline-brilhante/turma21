package lista5;

import java.util.Scanner;

import lista5objetos.ProdutoEletronico;

public class Eletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.println("Tipo de produto: ");
		produto1.produto = leia.nextLine();
		
		System.out.println("\nTipo de Bateria: ");
		produto1.bateria = leia.next();
		
		System.out.println("\nPossui entrada USB? (1- SIM/ 2- N�O)");
		produto1.usb = leia.nextInt() == 1 ? true : false;
		
		System.out.println("\nPossui conex�o WIFI? (1- SIM/ 2- N�O)");
		produto1.wifi = leia.nextInt() == 1 ? true : false;
		
		System.out.println("Pre�o: ");
		produto1.preco = leia.nextDouble();
		
		System.out.println("\nEst� dispon�vel? (1- SIM/ 2- N�O)");
		produto1.disponivel = leia.nextInt() == 1 ? true : false;
		
		System.out.println();
		
		produto1.mostraProduto();
		produto1.mostraBateria();
		System.out.println(produto1.usb ? "\nEntrada USB: Sim" : "\nEntrada USB: N�o");
		System.out.println(produto1.wifi ? "\nWifi: Sim" : "\nWifi: N�o");
		produto1.mostraPreco();
		System.out.println(produto1.disponivel ? "\nDispon�vel? Sim" : "\nDispon�vel? N�o");
		

	}

}
