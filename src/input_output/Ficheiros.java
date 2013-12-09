package input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ficheiros {

	void output(String str, String filePath) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(filePath)); 
		out.print(str); 
		out.close();
	}
	
	String input(String filePath) throws IOException, FileNotFoundException {
		BufferedReader in = new BufferedReader(new FileReader(filePath)); 
		String text = in.readLine(); 
		in.close();
		
		return text;
	}

}
