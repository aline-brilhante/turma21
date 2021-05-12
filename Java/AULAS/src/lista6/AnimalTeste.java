package lista6;

import java.util.Scanner;

import lista6objetos.Cachorro;
import lista6objetos.Cavalo;
import lista6objetos.Preguica;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cachorro dog = new Cachorro("Nino", 3);
		Cavalo pocoto = new Cavalo("Bojack", 4);
		Preguica pregui = new Preguica("Bichinho", 2);
		
	
		
		System.out.println("Nome do doguinho: " + dog.getNome());
		
		System.out.println(pocoto.getIdade());
		
		dog.som();
		pocoto.som();
		dog.movimento();
		pocoto.movimento();
		System.out.println("\nSurgiu uma preguicinha: ");
		pregui.movimento();
		
		
	}

}
