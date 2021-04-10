package br.com.cristian;

import java.util.Scanner;

//Classe 
public class Main {

	public static void main(String[] args) {
		
		/*Cria��o de objeto*/
		Scanner input = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		Pessoa p1 = new Pessoa("Cristian", "Vieira");
		
		//Cria��o de 3 Funcion�rios
		Funcionario f = new Funcionario();
		Funcionario f1 = new Funcionario("Marcos", "Barbosa Vieira");
		Funcionario f2 = new Funcionario();
		
		//Cria��o de 3 Professores
		Professor pr = new Professor();
		Professor pr1 = new Professor("Lucio", "Silva");
		Professor pr2 = new Professor();

		// Pessoa, Funcionario e Professor
		p.setNome("Cristian"); p.setSobrenome("Vieira");
		
		f.setNome("Marcos"); f.setSobrenome("Barbosa");
		
		pr.setNome("Lucio"); pr.setSobrenome("Silva");
		
		
		//Usando m�todo setMatricula e setSalario
		f.setMatricula(10); f.setSalario(1500.00);
		
		f1.setMatricula(20); f1.setSalario(2300.00);
		
		//Usando m�todo setMatricula e setSalario 
		pr.setMatricula(30); pr.setSalario(5000.00);
		
		pr1.setMatricula(40); pr1.setSalario(6000.00);
		

                 //-TESTANDO O SISTEMA-	
		
// Exibindo o nome e sobrenome do objeto criado
		System.out.println("Nomes objetos p e p1: ");
		System.out.println(p.getNome() + " " + p.getSobrenome());
		System.out.println(p1.getNomeCompleto());
		System.out.println();
		
// Exibindo o nome e sobrenome do objeto criado
		System.out.println("Nomes objetos f e f1: ");
		System.out.println(f.getNome() + " " + f.getSobrenome());
		System.out.println(f1.getNomeCompleto());
		System.out.println();

// Exibindo o nome e sobrenome do objeto criado
		System.out.println("Nomes objetos pr e pr1: ");
		System.out.println(pr.getNome() + " " + pr.getSobrenome());
		System.out.println(pr1.getNomeCompleto());
		System.out.println();
			
//Exibindo com o m�todo getMatricula, as matriculas do objeto "f1" 
		System.out.println("Matriculas f1 e pr1:");
		System.out.println(f1.getMatricula());
		System.out.println(pr1.getMatricula());
		System.out.println();
		
//Exibindo com o m�todo getSalario, o sal�rio total do objeto "f" da classe Funcion�rio 	
		System.out.println("Salario total do objeto f, em seguida valor da primeira e segunda parcela:");
		System.out.println(f.getSalario());
		System.out.println(f.getSalarioPrimeiraParcela());
		System.out.println(f.getSalarioSegundaParcela());
		System.out.println();
		
//Exibindo com o m�todo getSalario, o sal�rio total do objeto "pr" classe Professor
		System.out.println("Salario total do objeto pr, em seguida valor da primeira e segunda parcela");
		System.out.println(pr.getSalario());
		System.out.println(pr.getSalarioPrimeiraParcela());
		System.out.println(pr.getSalarioSegundaParcela());
		System.out.println();

               //-TESTANDO VIA TERMINAL: PROFESSOR -
		// Entrada de Dados 
		System.out.println();
		System.out.println();
		System.out.println("Digite com os dados de um Professor...");
		System.out.print("Digite o nome do Professor: ");
		pr2.nome = input.next();
		System.out.print("Digite o sobrenome do Professor: ");
		pr2.sobrenome = input.next();
		System.out.print("Digite a matricula: ");
		pr2.matricula = input.nextInt();
		System.out.print("Digite o Sal�rio: ");
		pr2.salario = input.nextDouble();
		pr2.setSalario(pr2.salario);
		System.out.println();
		System.out.println();
		
		//Sa�da de Dados 
		System.out.println("Professor: "+ pr2.getNomeCompleto());
		System.out.println("Matr�cula: "+ pr2.getMatricula());
		System.out.println("Sal�rio: "+ pr2.getSalario());
		System.out.println("Primeira Parcela: "+pr2.getSalarioPrimeiraParcela());
		System.out.println("Segunda Parcela: "+pr2.getSalarioSegundaParcela());
		System.out.println();
		System.out.println();
                            //-TESTANDO VIA TERMINAL: FUINCIONARIO-
               	// Entrada de Dados 
				System.out.println();
				System.out.println();
				System.out.println("Digite com os dados de um Funcionario...");
				System.out.print("Digite o nome do Funcionario: ");
				f2.nome = input.next();
				System.out.print("Digite o sobrenome do Funcionario: ");
				f2.sobrenome = input.next();
				System.out.print("Digite a matricula: ");
				f2.matricula = input.nextInt();
				System.out.print("Digite o Sal�rio: ");
				f2.salario = input.nextDouble();
				f2.setSalario(f2.salario);
				System.out.println();
				System.out.println();
				
				//Sa�da de Dados 
				System.out.println("Funcionario: "+ f2.getNomeCompleto());
				System.out.println("Matr�cula: "+ f2.getMatricula());
				System.out.println("Sal�rio: "+ f2.getSalario());
				System.out.println("Primeira Parcela: "+f2.getSalarioPrimeiraParcela());
				System.out.println("Segunda Parcela: "+f2.getSalarioSegundaParcela());
		
	}

}
