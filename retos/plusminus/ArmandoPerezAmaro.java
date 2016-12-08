package hackerrank.test.retos.plusminus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArmandoPerezAmaro {
	
	public static void generarV(int[] v,String o) { // Generamos un vector
		Scanner s = new Scanner(o).useDelimiter("\\s* \\s*");
		for (int i = 0; i < v.length; i++) {
			v[i]=s.nextInt();
		}
	}
	
	public static void fraccionV(int[] v) { // Tomamos la infraestructura
		int sumapositivo=0,sumanegativo=0,sumacero=0;
		double positivo,negativo,cero;
		DecimalFormat datos = new DecimalFormat("0.000000");
		for (int i = 0; i < v.length; i++)
		{
			if(v[i]<0)
			{
				sumanegativo=sumanegativo+1;
			}else if(v[i]>0)
			{
				sumapositivo=sumapositivo+1;
			}else
			{
				sumacero=sumacero+1;
			}
		}
		positivo=(double)sumapositivo/(double)v.length;
		negativo=(double)sumanegativo/(double)v.length;
		cero=(double)sumacero/(double)v.length;
		//System.out.println("Fraccion Positiva: "+datos.format(positivo));
		//System.out.println("Fraccion Negativa: "+datos.format(negativo));
		//System.out.println("Fraccion Cero: "+datos.format(cero));
		System.out.println(datos.format(positivo));
		System.out.println(datos.format(negativo));
		System.out.println(datos.format(cero));
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
			int[] v = new int[n]; // Creamos el vector
			Scanner sr = new Scanner(System.in);
			//System.out.print("Otorga el valor de la linea : ");
			String o = sr.nextLine();
			//System.out.println("Linea: "+o);
			generarV(v,o); // Llenamos el vector.
			fraccionV(v);//verificamos las fracciones.
		}
	}
}
