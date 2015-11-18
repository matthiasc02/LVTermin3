
public class GrenzwertReihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(berechneGrenzwert(0.01));
		System.out.println(berechneGrenzwert(0.001));
		System.out.println(berechneGrenzwert(0.0001));
	}
	
//ACHTUNG!!! Methode muss auﬂerhalb von Main sein!!!!!!!!!
	
	public static double berechneGrenzwert(double genauigkeit){
		double aWert=0;
		double vWert=0;

		for(int i=1;  ;i*=2)
		{
			aWert+=1.0/i;
			if( aWert-vWert < genauigkeit){
				break;
			}
			vWert=aWert;
			
		}
		return aWert;
	}
	
}
