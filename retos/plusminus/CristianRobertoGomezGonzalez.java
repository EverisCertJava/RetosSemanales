package hackerrank.test.retos.plusminus;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CristianRobertoGomezGonzalez {
	
	 public static void main(String []args){
	        int cantidad,pos=0,neg=0,cero=0;
	        String cadena;
	        Scanner entrada = new Scanner(System.in);
	        
	        cantidad = Integer.parseInt(entrada.nextLine());
	        cadena = entrada.nextLine();
	        String[] cseparada = cadena.split("\\ ");
	        for(int i=0;i<cantidad;i++){
	            if(Integer.parseInt(cseparada[i])>0)
	                pos++;
	            if(Integer.parseInt(cseparada[i])<0)
	                neg++;
	            if(Integer.parseInt(cseparada[i])==0)
	                cero++;
	        }
	        calcular(cantidad,pos);
	        calcular(cantidad,neg);
	        calcular(cantidad,cero);
	     }
	    
	     public static void calcular(int cantidad,int contador){
	         DecimalFormat df = new DecimalFormat("0.000000");
	         double res = (double)contador/cantidad;
	         System.out.println(df.format(res));
	     }
}