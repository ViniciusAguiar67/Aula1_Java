package Exercicio_3;

public class Novo_salario {
	
	public float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void new_salario() {

		float novo_sal = (float) (salario * 0.25);
		float sal_atual = (float) (novo_sal + salario);

		System.out.println("O novo salário é R$ " + sal_atual);
	}
}
