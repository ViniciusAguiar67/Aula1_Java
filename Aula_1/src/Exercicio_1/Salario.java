package Exercicio_1;

public class Salario {
	
	public int valor_hora;
	public int horas;

	public int getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(int valor_hora) {
		this.valor_hora = valor_hora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void salario_liquido() {

		float desc = (float) (valor_hora * horas * 0.009);
		float salario = (float) (valor_hora * horas);
		float salario_final = (salario - desc);

		System.out.println("O resultado é: " + salario_final);
	}

}
