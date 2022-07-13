package pooExercicio05;

public class Funcionario {

	private int codigo;
	private char turnoDeTrabalho;
	private char categoria;
	
	//Metodo construtor, estou construindo uma logica para a criação do codigo do funcionário,
	//dessa forma o usuário não precisa inserir codigo, o sistema mesmo vai dar o codigo.
	
	
	public Funcionario() {
		this.codigo = (int)(Math.random() * 100);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	/* public String getCodigo() {
	return "FUN" + codigo; 
	}*/
	
	public char getTurnoDeTrabalho() {
		return turnoDeTrabalho;
	}
	
	public void setTurnoDeTrabalho(char turnoDeTrabalho) {
		this.turnoDeTrabalho = turnoDeTrabalho;
	}
	
	//O get serve para retornar valores prédefinidos ou setados pelo usuário.
	public char getCategoria() {
		return categoria;
	}
	
	//O set serve para setar valor a variavel, dar valor, informarção.
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}	
}
