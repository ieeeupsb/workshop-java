package todolist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
	TodoList todolist = new TodoList();
	
	public CLI() {
		// TODO load todolist from file if available
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
	
	private void addMenu() {
		// TODO Auto-generated method stub
	}
	private void checkItemMenu() {
		// TODO Auto-generated method stub
	}
	private void clearMenu() {
		// TODO Auto-generated method stub
	}
	private void exit() {
		// TODO On exit save todo list to file
	}
	
	private void goToSubMenu(int option) {
		switch (option) {
		case 1:
			System.out.println(todolist.toString());
		case 2:
			this.addMenu();
		case 3:
			this.checkItemMenu();
		case 4:
			this.clearMenu();
		case 5:
			this.exit();
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		CLI cli = new CLI();
		
		cli.header();
		
		while(true) {
			cli.menu();
			
			int option = cli.readOption();
			
			cli.goToSubMenu(option);
		}
	}


}
