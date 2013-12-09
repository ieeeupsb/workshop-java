package todolist;

import java.util.ArrayList;

public class TodoList {

	public ArrayList<ListItem> todos;

	public TodoList() {
		this.todos = new ArrayList<>();
	}

	public void addItem(ListItem listItem) {
		this.todos.add(listItem);
	}

	public void removeItem(ListItem item) {
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

}
