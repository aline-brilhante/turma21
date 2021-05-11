package lista5objetos;

public class FuncionarioObjeto {
	//atributos
	public String nome;
	public String cpf;
	public double salario;
	public int horarioDeEntrada;
	public int horarioDeSaida;
	
	//metodos
	public void horasTrabalhadas () {
		System.out.println("Horas trabalhadas por dia: " + (horarioDeSaida - horarioDeEntrada) + "h");
	}
	
	public void mostraSalario () {
		System.out.println("Salário: " + salario + " mil reais");
	}


}
