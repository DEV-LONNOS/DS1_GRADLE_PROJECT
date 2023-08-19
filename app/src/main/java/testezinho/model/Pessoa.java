package testezinho.model;

public class Pessoa {
	
	public String nome;
	private int idade;
	
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws Exception { 
		System.out.println("Estou controlando como o novo nome é atributo");
		//
		if (this.idade > 18) {
			this.nome = nome;
		}else {
			throw new Exception();
		}
	}
		
		
	}
	
	

