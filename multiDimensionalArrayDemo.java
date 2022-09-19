package odev1;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][]  cities = new String[3][3];

		cities[0][0] = "Ýstanbul";
		cities[0][1] = "Bilecik";
	
		cities[1][0] = "Ankara";
		cities[1][1] = "Kayseri";

		cities[2][0] = "Gaziantep";
		cities[2][1] = "Þanlýurfa";

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 1; j++) {
				System.out.println(cities[i][j]);
			}
			System.out.println("____________");
		}
	}

}
