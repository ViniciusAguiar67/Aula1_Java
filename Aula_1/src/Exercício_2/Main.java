package Exercício_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		Soma soma = new Soma();

		System.out.print("Entre com o primeiro valor: ");
		int n1 = ler.nextInt();
		soma.setN1(n1);

		System.out.print("Entre com o segundo valor: ");
		int n2 = ler.nextInt();
		soma.setN2(n2);

		System.out.print("Entre com o terceiro valor: ");
		int n3 = ler.nextInt();
		soma.setN3(n3);
		
		System.out.print("Entre com o quarto valor: ");
		int n4 = ler.nextInt();
		soma.setN4(n4);

		soma.somar();

	}

}
