
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[5];
		numbers[0] = 2121;
		System.out.println(numbers[0]);

		int[] Array1 = { 3, 4, 5 };
		int[] Array2 = { 7, 1, 3 };

		// Ausgabe + Rechnen der Beiden Arrays
		System.out.println(
				"+ " + (Array1[0] + Array2[0]) + ", " + (Array1[1] + Array2[1]) + ", " + (Array1[2] + Array2[2]));

		// Ausgabe * Rechnen der Beiden Arrays
		System.out.println(
				"* " + (Array1[0] * Array2[0]) + ", " + (Array1[1] * Array2[1]) + ", " + (Array1[2] * Array2[2]));

		//Wochentage Ausgeben
		
		String[] tage = {"Mo","Di","Mi","Do","Fr","Sa","So"};
		
		for(int t=0; t<tage.length;t++){
			System.out.println(tage[t]);
		}
		
	}

}
