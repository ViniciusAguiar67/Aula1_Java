package Exercicio_1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		Salario salario = new Salario();

		System.out.print("Entre com o valor da hora: ");
		int valor = ler.nextInt();
		salario.setValor_hora(valor);

		System.out.print("Entre com o número de horas: ");
		int num = ler.nextInt();
		salario.setHoras(num);

		salario.salario_liquido();
	}

}
