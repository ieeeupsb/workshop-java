package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {
	String input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
	}
	
	void output(String str) {
		System.out.println(str);
	}
}
