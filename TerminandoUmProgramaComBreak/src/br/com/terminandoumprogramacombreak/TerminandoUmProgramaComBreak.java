package br.com.terminandoumprogramacombreak;

/**
 * Programa em Java que termina uma execução com break;
 * @author Erick Freire
 * @version 1 - Criado em 16-04-2021
 */

public class TerminandoUmProgramaComBreak {
	public static void main(String[] args) {
		
		int contador;
		
		for(contador = 1; contador <= 10; contador++) {
			
			if(contador == 5)
				break;
			
			System.out.printf("%d ", contador);
			
		}
		
		System.out.printf("%nO laço foi interrompido quando o contador estava em: %d%n", contador);
		
	}

}
