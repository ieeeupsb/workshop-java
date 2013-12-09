package todolist;

import java.util.ArrayList;

public class TodoList {

	public ArrayList<Task> todos;

	public TodoList() {
		this.todos = new ArrayList<>();
	}

	public void addItem(Task listItem) {
		this.todos.add(listItem);
	}

	public void removeItem(Task item) {
		this.todos.remove(item);
	}

	@Override
	public String toString() {
		String str = new String();

		for (int i = 0; i < todos.size(); i++) {
			System.out.println(i + ": " + todos.get(i).toString());
		}

		return str;
	}

	public void clearDone() {
		for(int i = 0; i < todos.size(); i++)
			if( todos.get(i).checked ) {
				todos.remove(i);
				i--;
			}
	}

}
