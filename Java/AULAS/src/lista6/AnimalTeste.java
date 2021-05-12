package lista6;

import java.util.Scanner;

import lista6objetos.Animal;
import lista6objetos.Cachorro;
import lista6objetos.Cavalo;
import lista6objetos.Preguica;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cachorro dog = new Cachorro("Nino", 3, "au au au", "Corrreee!");
		Cavalo pocoto = new Cavalo("Bojack", 4, "riiiinrriiihinhóin", "cavalgando por aí!");
		Preguica pregui = new Preguica("Bichinho", 2, "hmmmm", "Escalando uma árvore...");
		
		Animal[] animais = new Animal[3];
		animais[0] = dog;
		animais[1] = pocoto;
		animais[2] = pregui;
		
		for(Animal animal:animais) {
			System.out.println(animal.getNome());
		}
		
	}

}
