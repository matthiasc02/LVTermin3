
public class KleinesEinMalEins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//z == 10 geht nicht da nach der ersten Abfrage z = 10 ist -> Abbruch
		//m�glich w�re z!=10 aber nicht so machen da Fehleranf�llig
		
		for(int z=1;z<=10;z++){
			
			for(int i=1;i<=10;i++){
				System.out.print((z*i)+"\t");
			}
			System.out.println();
		}

	}

}
