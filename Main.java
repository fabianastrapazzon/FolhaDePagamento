package pooExercicio05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		
		
		Scanner input = new Scanner(System.in);
		
				
		Funcionario funcionario = new Funcionario();
		funcionario.setTurnoDeTrabalho(lerTurnoTrabalho(input));
		funcionario.setCategoria(lerCategoria(input));
		
		
		int horasTrabalhadas = lerHorasTrabalhadas(input);
		FolhaDePagamento folha = new FolhaDePagamento(funcionario, horasTrabalhadas);
		folha.calcularSalarioFinal();
		folha.imprimirFolhaDePagamento();
		
		
		
	}
		
		
		//Leitura de DADOS, possivelmente outra classe.
	
	
	
		private static char lerTurnoTrabalho(Scanner input) {
	
			char turnoDeTrabalho = 'x';
			System.out.print("Informe o turno de trabalho:\nMatutino [M] \nVespertino [V] \nNoturno [N] ");

			while (turnoDeTrabalho != 'M' && turnoDeTrabalho != 'V' && turnoDeTrabalho != 'N') {
			
			turnoDeTrabalho = input.next().charAt(0);
		
			if(turnoDeTrabalho != 'M' && turnoDeTrabalho != 'V' && turnoDeTrabalho != 'N') {
				System.out.print("Código invalidado, insira o codigo de corretamente:\nMatutivo Mm]\nVespertino[V]\nNoturno[N]");
			}
		}
			
			return turnoDeTrabalho;
			
		}

		
		private static char lerCategoria(Scanner input) {
			char categoria = 'x';
			
			System.out.print("\nInforme a categoria de trabalho:\nGerencia [G] \nOperario [O] ");
						
			while (categoria != 'G' && categoria != 'O') {
					
				categoria = input.next().charAt(0);
				
				if (categoria != 'G' && categoria != 'O') {
					System.out.print("\nInforme a categoria de trabalho:\nGerencia [G] \nOperario [O] ");
				}
			}
			
			return categoria;
		}
		
		private static int lerHorasTrabalhadas(Scanner input) {
			System.out.print("\nInforme a quantidade de horas tabalhadas: ");
			int horasTrabalhadas = input.nextInt();
			
			return horasTrabalhadas;
		}
		
		
		

}
