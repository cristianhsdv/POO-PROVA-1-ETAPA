package br.com.cristian;
import java.util.Scanner;


//Criação classe
public class Funcionario extends Pessoa{
	
	public int matricula;
	public double salario;
	
	Scanner input = new Scanner(System.in);
	
	public void setSalario(double valor){
		while(valor < 0){
			System.out.println("Valor negativo. Informe um novo salario.");
			valor = input.nextDouble();
		}
		this.salario = valor;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public Funcionario(){
		super();
	}
	
	
	//Parametro
	public Funcionario(String nome, String sobrenome){
		super(nome, sobrenome);
	}
	
	
	
	public double getSalarioPrimeiraParcela() {
		return 0.6*this.salario;
	}
	
	public double getSalarioSegundaParcela() {
		return 0.4*this.salario;
	}
	public double getSalario(){
		return this.salario;
		
	}
}
