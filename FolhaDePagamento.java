package pooExercicio05;

public class FolhaDePagamento {

	//Definindo uma variavel imutavel, fixa.
	private static final double SALARIO_MINIMO = 450.00;
	
	private Funcionario funcionario;
	private int numeroHorasTrabalhadas;
	private double valorHoraTrabalhada;
	private double salarioInicial;
	private double valorAuxilioAlimentacao;
	private double salarioFinal;
	
	public FolhaDePagamento(Funcionario funcionario, int horasTrabalhadas) {
		this.funcionario = funcionario;
		this.numeroHorasTrabalhadas = horasTrabalhadas;
	}
	
	public void calcularSalarioFinal() {
		this.calcularHora();
		this.calcularSalarioInicial();
		this.calcularAuxilioAlimentacao();
		
		this.salarioFinal = this.salarioInicial + this.valorAuxilioAlimentacao;
	}
	
	public void imprimirFolhaDePagamento() {
		System.out.println("\nCOD:" + this.funcionario.getCodigo());
		System.out.println("Horas trabalhadas: " + this.numeroHorasTrabalhadas);
		System.out.println("Salario Inicial: R$" + this.salarioInicial);
		System.out.println("Auxilio Alimentação: R$" + this.valorAuxilioAlimentacao);
		System.out.println("Salario Final: R$" + this.salarioFinal);
		System.out.println();
	}
	
	
	private void calcularHora() {
		
		double valorHoraTrabalhada;
		
		if (funcionario.getCategoria() == 'G') {
			
			if (funcionario.getTurnoDeTrabalho() == 'N')
			valorHoraTrabalhada = (SALARIO_MINIMO * 0.18);
			
			else
				valorHoraTrabalhada = (SALARIO_MINIMO * 0.15);
		}
		
		else {
			if (funcionario.getTurnoDeTrabalho() =='N')
				valorHoraTrabalhada = (SALARIO_MINIMO * 0.13);
			
			else
				valorHoraTrabalhada = (SALARIO_MINIMO * 0.10);
			}
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	
	private void calcularSalarioInicial() {
		
		this.salarioInicial = (this.valorHoraTrabalhada * this.numeroHorasTrabalhadas);
	}
	
	
	private void calcularAuxilioAlimentacao() {
		
		double auxilioAlimentacao;
		
		if (salarioInicial <= 300.00) {
			
			auxilioAlimentacao = (salarioInicial * 0.20);
			}
		
		else if (salarioInicial > 300.00 && salarioInicial <= 600.00) {
				
			auxilioAlimentacao = (salarioInicial * 0.15);
			}
			
		else {
			auxilioAlimentacao = (salarioInicial * 0.05);
			}
		
		this.valorAuxilioAlimentacao = auxilioAlimentacao;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
