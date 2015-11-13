
public class LoopDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) // for Schleife
		{
			System.out.println("Durchlauf " + i);
		}

		int j = 1; // selbes Beispiel in einer while Schleife
		while (j <= 10) {
			System.out.println("Durchlauf " + j);
			j++;
		}
		// 20..90 nur jede 5. Zahl
		for (int i = 20; i <= 90; i += 5) {
			System.out.println(i);
		}
		// 1...100 nur jene die durch 3 Teilbar sind
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		// 1...100 nur jene die durch 3 Teilbar sind
		// Abbruch wenn 10te Zahl gefunden die durch 3 teilbar ist
		int z = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				z++;
			}
			if (z == 10) {
				break;
			}
		}

		// Ausgabe aller Zahlen 1...100
		// jene Zahlen die durch 5 teilbar sind bzw. die Zahlen
		// 40...70 generell ausschließen von der Ausgabe

		for (int i = 1; i <= 100; i++) {
			if ((i >= 40 && i <= 70) || i % 5 == 0) {
				continue;
			}
			/*
			if (i % 5 == 0) {
				continue;
			}
			*/
			System.out.println(i);
		}

	}

}
