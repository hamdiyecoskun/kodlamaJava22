package odev1;

public class miniProjeAsalSayý {
	public static void main(String[] args) {
		int number = -1;
		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Geçersiz sayý girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime && number != 1) {
			System.out.println("Sayý asaldýr.");
		} else {
			System.out.println("Sayý asal deðildir.");
		}
	}

}
