package java.poo.objetos;

public class Cliente {

		

		
		/*1) Crie uma classe cliente e apresente os atributos e métodos
		 *  referentes esta classe, em seguida crie um objeto cliente, 
		 *  defina as instancias deste objeto e apresente as informações 
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
