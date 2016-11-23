package hackerrank.test.retos.diagonaldifference;

import java.util.Scanner;

public class CristianRobertoGomezGonzalez {
	public static void main(String []args){
        int tam = 0,suma1=0,suma2=0,resultado;
        
        Scanner entrada = new Scanner(System.in);
        tam = Integer.parseInt(entrada.nextLine());
        
        for(int i = 0;i < tam; i++){
        String cadena = entrada.nextLine(); 
        String[] separada = cadena.split("\\ "); 
        suma1 = Integer.parseInt(separada[i]) + suma1; 
        suma2 = Integer.parseInt(separada[tam-1-i]) + suma2;
        }
        
        resultado = Math.abs(suma1 - suma2);
        
        System.out.println(""+resultado);
        
     }
}
