package Exercicio_3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		Novo_salario novo_Salario = new Novo_salario();

		System.out.print("Entre com o valor do salario: ");
		float sal = ler.nextFloat();
		novo_Salario.setSalario(sal);

		novo_Salario.new_salario();
	}

}
