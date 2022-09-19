package odev1;

public class arraysDemo {
	public static void main(String[] args) {

		String[] students = new String[4];
		students[0] = "Engin";
		students[1] = "Derin";
		students[2] = "Salih";
		students[3] = "Ahmet";

		for (String student : students) {
			System.out.println(student);
		}
	}
}
