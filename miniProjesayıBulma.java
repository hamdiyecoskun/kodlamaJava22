package odev1;

public class miniProjesay�Bulma {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int num = 5;
		boolean isExist = false;

		for (int number : numbers) {
			if (number == num) {
				isExist = true;
				break;
			}
		}

		if (isExist) {
			System.out.println("Say� mevcuttur.");
		} else {
			System.out.println("Say� mevcut de�ildir.");
		}
	}
}
