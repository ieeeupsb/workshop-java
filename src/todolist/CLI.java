package todolist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
	static final String FILE_NAME = "todolist.csv";
	
	TodoList todolist = new TodoList();
	private boolean isOver;
	
	public CLI(String filename) throws IOException {
		this.loadFromFile(filename);
	}

	public CLI() {
	}

	private void loadFromFile(String fileName) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
		
		String text = in.readLine();
		
		while(text != null) {
			String[] fields = text.split(",");
			todolist.addItem(new Task(fields[0], Boolean.parseBoolean(fields[1]), fields[2]));
			text = in.readLine();
		}
		in.close();
		
		
	}

	private void header() {
		System.out.println(
			"###### TODO List Management ######\n\n"
		);
	}

	private void menu() {
		System.out.println(
			"1: Show Todo List\n" +
			"2: Add todo\n" +
			"3: Check todo\n" +
			"4: Clear done\n" +
			"5: Exit\n"
		);
	}

	private int readOption() {
		System.out.print("todolist> ");
		
		int option = 0;
		
		try {
			option = new Scanner(System.in).nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("Not an option! Try a number.");
			readOption();
		}
		
		return option;
	}
	
	private void showTodoList() {
		System.out.println("#### Todolist:");
		for (int i = 0; i < todolist.todos.size(); ++i) {
			Task task = todolist.todos.get(i);
			String check = (task.checked ? "done" : "not done");
			
			System.out.println(i + ": " + task.text + " | " + task.dueDate + " | " + check);
		}
		
		System.out.println();
	}
	
	private void addMenu() {
		System.out.print("new todo> text: ");
		String text = new Scanner(System.in).nextLine();
		System.out.print("new todo> date: ");
		String date = new Scanner(System.in).nextLine();
		
		todolist.addItem(new Task(text, date));
		
		System.out.println("new task added!");
	}
	
	private void checkItemMenu() {
		this.showTodoList();
		
		if( todolist.todos.size() == 0 ) {
			System.out.println("Add some tasks first!");
			return;
		}
		
		System.out.print("Which task to check? ");
		int index = new Scanner(System.in).nextInt();
		
		todolist.todos.get(index).checked = true;
	}
	private void clearMenu() {
		todolist.clearDone();
	}
	private void exit() {

		PrintWriter out = null;
		
		try {
			out = new PrintWriter(new FileWriter(FILE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Task task: todolist.todos) {
			out.print(task.toString() + "\n");
		}
		
		out.close();
		
		isOver = true;
	}
	
	private void goToSubMenu(int option) {
		switch (option) {
		case 1:
			this.showTodoList();
			break;
		case 2:
			this.addMenu();
			break;
		case 3:
			this.checkItemMenu();
			break;
		case 4:
			this.clearMenu();
			this.showTodoList();
			break;
		case 5:
			this.exit();
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		CLI cli = null;
		
		try {
			cli = new CLI(FILE_NAME);
		} catch (IOException e) {
			System.out.println("Couldn't load list from file!");
			cli = new CLI();
			
			e.printStackTrace();
		}
		
		cli.header();
		
		while(!cli.isOver) {
			cli.menu();
			
			int option = cli.readOption();
			
			cli.goToSubMenu(option);
		}
	}


}
