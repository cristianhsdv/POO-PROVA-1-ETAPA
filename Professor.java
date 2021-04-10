package br.com.cristian;


//Criação da classe 
public class Professor extends Funcionario{
	
		
	public Professor(){
		super();
	}
	
	public Professor(String primeironome, String segundonome){
		super(primeironome,segundonome);
	}
	
	@Override
	public double getSalarioPrimeiraParcela() {
		return super.getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
