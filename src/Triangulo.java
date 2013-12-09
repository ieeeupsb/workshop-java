public class Triangulo {

	public static void main(String[] args) {
		int counter = 1;

		for (int i = 0; i < 10; i++) {
			counter++;
			System.out.println();
			for (int j = 1; j < counter; j++) {
				System.out.print("*");
			}
		}
	}

}
