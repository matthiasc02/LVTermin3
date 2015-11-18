
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMatrix(generateIdentityMatrix(4));
		printMatrix(generateIdentityMatrix(5));



	}
	public static double[][] generateIdentityMatrix(int size)
	{
		double [][] Matrix = new double [size][size];
		
		for (int z=0;z<size;z++)
		{
			Matrix[z][z]=1.0;
		}
		/*
		for(int z=0;z<size;z++)
		{
		for (int i=0;i<size;i++)
		{
			if(z==i) // hier wird der Jeweilige wert der Gleich ist auf 1 gesetzt
			{
			Matrix[z][i]=1.0;
			}
			System.out.print(Matrix[z][i]+" ");
		}		
		System.out.println();
		}		*/
		return Matrix;
	}
		
		public static void printMatrix(double[][] Matrix)
		{
			for(int z=0;z<Matrix.length;z++)
			{
			for (int i=0;i<Matrix[z].length;i++)//Länge der äußeren Schleife, damit es mit nicht quadratischen Matrixen auch funktioniert
			{
				System.out.print(Matrix[z][i]+"\t");
			}		
			System.out.println();
		}

	}

}
