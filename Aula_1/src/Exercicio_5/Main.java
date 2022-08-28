package Exercicio_5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner(System.in);
		
	Calc_sal calc_sal = new Calc_sal();
		
	System.out.print("Entre com o valor do salario: ");
	float sal = ler.nextFloat();
	calc_sal.setSalario(sal);
	
	calc_sal.novo_salario();
	}

}
