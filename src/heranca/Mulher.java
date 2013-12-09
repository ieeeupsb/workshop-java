package heranca;

public class Mulher extends Pessoa {
	String sexo = "feminino";

	public static void main(String[] args) {
		Mulher m = new Mulher();
		
		System.out.println(m.idade);
	}
}
