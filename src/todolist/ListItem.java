package todolist;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class ListItem {
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM HH:mm yyyy");

	boolean check = false;
	GregorianCalendar dueDate = new GregorianCalendar();
	String text;
	
	public ListItem() {
		this.text = "New Todo";
	}
	
	public ListItem(String text) {
		this.text = text;
	}
	
	public ListItem(String text, GregorianCalendar date) {
		this.text = text;
		this.dueDate = date;
	}

	public void check() {
		this.check = true;
	}

	public boolean isChecked() {
		return this.check;
	}
	
	@Override
	public String toString() {
		return this.text + "\n" + dateFormat.format(this.dueDate.getTime());
	}

}
