package todolist.testsuite;

import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Test;

import todolist.ListItem;

public class TestListItem {

	@Test
	public void testCheckItem() throws Exception {
		ListItem item = new ListItem("Fazer Exercicio 1",
				new GregorianCalendar(2013, 11, 11));

		item.check();

		assertTrue(item.isChecked());
	}

}
