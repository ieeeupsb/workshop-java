package heranca;

public class Pessoa {

	int idade = 18;
	String morada;
	double saldo;
	
	public int getIdade() {
		return this.idade;
	}
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println("idade = " + p.idade);
	}
		
}
