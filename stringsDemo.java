package odev1;

public class stringsDemo {
	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		System.out.println(message);

		System.out.println("Eleman sayýsý: " + message.length());
		System.out.println("5.Eleman: " + message.charAt(4));
		System.out.println(message.concat(" Yaþasýn!"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] chars = new char[5];
		message.getChars(0, 5, chars, 0);
		System.out.println(chars);
		System.out.println(message.indexOf("av"));
		System.out.println(message.lastIndexOf("a"));

	}
}
