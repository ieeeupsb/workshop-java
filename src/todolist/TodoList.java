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

}
