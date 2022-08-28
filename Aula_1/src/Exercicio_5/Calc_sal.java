package Exercicio_5;

public class Calc_sal {
	
public float salario;
	
	public float getSalario() {
	return salario;
}

public void setSalario(float salario) {
	this.salario = salario;
}

	public void novo_salario() {
		
		float grat = (float) (salario * 0.05);
		float desc = (float) (salario * 0.12);
		float atual_sal = (float) ((salario + grat) - desc);
		
		System.out.println("O valor atualizado do salario é R$ " + atual_sal);
	}

}
