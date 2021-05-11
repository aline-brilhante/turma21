package lista5;

import lista5objetos.FuncionarioObjeto;

public class Funcionario {
	public static void main(String[] args) {
		
		
		FuncionarioObjeto funcionario1 = new FuncionarioObjeto();
		
		funcionario1.nome = "João";
		funcionario1.cpf = "213623213-03";
		funcionario1.horarioDeEntrada = 10;
		funcionario1.horarioDeSaida = 18;
		funcionario1.salario = 2.100;
		
		
		System.out.println("Nome do funcionário: " + funcionario1.nome);
			
		System.out.println("CPF: " + funcionario1.cpf);
			
		funcionario1.horasTrabalhadas();
			
		funcionario1.mostraSalario();

	}


}
