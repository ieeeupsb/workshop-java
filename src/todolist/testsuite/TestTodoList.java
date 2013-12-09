package todolist.testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import todolist.ListItem;
import todolist.TodoList;

public class TestTodoList {
	@Test
	public void testAddItem() {
		TodoList todo = new TodoList();

		todo.addItem(new ListItem());

		assertEquals(1, todo.todos.size());
	}

	@Test
	public void testRemoveItem() {
		TodoList todo = new TodoList();
		ListItem item = new ListItem();

		todo.addItem(new ListItem());
		todo.addItem(item);
		todo.addItem(new ListItem());

		todo.removeItem(item);

		assertEquals(2, todo.todos.size());
	}
}
