package todolist;


public class Task {

	boolean checked = false;
	String dueDate;
	String text;

	public Task() {
		this.text = "New Todo";
	}

	public Task(String text) {
		this.text = text;
	}

	public Task(String text, String date) {
		this.text = text;
		this.dueDate = date;
	}
	
	public Task(String text, boolean checked, String date) {
		this.text = text;
		this.checked = checked;
		this.dueDate = date;
	}

	public void check() {
		this.checked = true;
	}

	public void unCheck() { // why would u do this? D:
		this.checked = false;
	}

	public boolean isChecked() {
		return this.checked;
	}
	
	@Override
	public String toString() {
		return this.text + "," + checked + ","
				+ this.dueDate;
	}

}
