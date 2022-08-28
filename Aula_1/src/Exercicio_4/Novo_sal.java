package Exercicio_4;

public class Novo_sal {
	
	public float salario;
	public float perc;


	public float getSalario() {
		return salario;
	}



	public void setSalario(float salario) {
		this.salario = salario;
	}



	public float getPerc() {
		return perc;
	}



	public void setPerc(float perc) {
		this.perc = perc;
	}



	public void sal_atual() {

		float val_perc = salario * (perc/100);
		float val_sal = salario + val_perc;

		System.out.println("\nO valor do salario atualizado é R$ " + val_sal);
		System.out.println("O valor de aumento é R$ " + val_perc);

	}
}
