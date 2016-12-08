package hackerrank.test.retos.diagonaldifference;

import java.util.Scanner;

public class ArmandoPerezAmaro {

	public static void generarV(int[][] v,String o, int p) { // Generamos un vector
		Scanner s = new Scanner(o).useDelimiter("\\s* \\s*");
		for (int i = 0; i < v.length; i++) {
			v[p][i]=s.nextInt();
		}
	}
	
	public static void sumaV(int[][] v,int n) { // Hace el histograma
		int aumenta=0,suma1=0,suma2=0,disminuye=v.length-1,total=0;
		for (int i = 0; i < v.length; i++)
		{
			suma1=suma1+v[i][aumenta];
			suma2=suma2+v[i][disminuye];
			aumenta=aumenta+1;
			disminuye=disminuye-1;
		}
		total=suma1-suma2;
		if (total<0){
			total=total*(-1);
		}
		System.out.println("La diferencia absoluta de las diagonales es: "+total);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Creamos el ingreso de datos
		//int maxi=0;
		
		//System.out.print("Otorga el valor de n: ");
		int n = sc.nextInt(); // Almacenamos cantidad de elementos
		//No debe ser menor o igual a 0
		if (n<=0)
		{
			System.out.print("El minimo valor de n debe ser 1");
		}
		else
		{
			int[][] v = new int[n][n]; // Creamos el vector multidimensional
			//System.out.println("Longitud 0: "+v.length);//vector primario longitud(Columnas)
			//System.out.println("Altitud 1: "+v[0].length);//Matriz = Altitud(Va cualquier numero en las llaves si no pasa de n
			for (int i = 0; i < n; i++)
			{
				Scanner sr = new Scanner(System.in);
				//int lin=i+1;
				//System.out.print("Otorga el valor de la linea "+lin+": ");
				String o = sr.nextLine();
				//System.out.println("Linea: "+o);
				generarV(v,o,i); // Llenamos el vector
			}
			sumaV(v,n);//Sumamos e imprimimos la diferencia
		}
	}
}
