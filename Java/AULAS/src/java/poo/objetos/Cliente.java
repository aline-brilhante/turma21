package java.poo.objetos;

public class Cliente {

		

		
		/*1) Crie uma classe cliente e apresente os atributos e m�todos
		 *  referentes esta classe, em seguida crie um objeto cliente, 
		 *  defina as instancias deste objeto e apresente as informa��es 
		 *  deste objeto no console.
		 */
		
		//atributos
		
		public String nome;
		public int anoNascimento;
		public char genero;
		
		public void calculaIdade () {
			System.out.print("Idade: " + (2021 - anoNascimento));
		}
		

}
