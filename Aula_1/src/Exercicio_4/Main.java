package Exercicio_4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		Novo_sal novo_sal = new Novo_sal();

		System.out.print("Entre com o valor do salario: ");
		float sal = ler.nextFloat();
		novo_sal.setSalario(sal);
		
		System.out.print("Entre com o percentual: ");
		float perc = ler.nextFloat();
		novo_sal.setPerc(perc);
		
		novo_sal.sal_atual();
	}

}
