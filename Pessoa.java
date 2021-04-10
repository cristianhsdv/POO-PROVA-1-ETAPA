package br.com.cristian;

public class Pessoa {

	 public String primeironome;
	 public String segundonome;
	 	
	public String getNome() {
		return primeironome;
	}
	
	      	public void setNome(String primeironome) {
		    this.primeironome = primeironome;
	}
	
	  
	public String getSobrenome() {
		return segundonome;
	}
	   
	       public void setSobrenome(String sobrenome) {
		   this.segundonome = segundonome;
	} 
	
	   
	public String getNomeCompleto() {
		return (this.primeironome + " " + this.segundonome).toString();
	}
	

	public Pessoa() {
	}
	
	  
	public Pessoa (String primeironome, String segundonome){
	   this.nome = primeironome;
	   this.sobrenome = segundonome;
	}	
}

