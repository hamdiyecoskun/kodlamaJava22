package odev1;

public class miniProjeAsalSay� {
	public static void main(String[] args) {
		int number = -1;
		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Ge�ersiz say� girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime && number != 1) {
			System.out.println("Say� asald�r.");
		} else {
			System.out.println("Say� asal de�ildir.");
		}
	}

}
