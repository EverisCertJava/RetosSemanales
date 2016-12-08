package hackerrank.test.retos.verybigsum;

import java.util.Scanner;

public class RaulOropezaJauregui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamaño = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el numero del arreglo:");
        tamaño = in.nextInt();
        int array[] = new int [tamaño];
        for(int i=0; i< tamaño; i++){
            System.out.println("Ingresa el "+(i+1)+" digito: ");
            array[i] = in.nextInt();
        }
        int resultado = calcula(array,tamaño);
        System.out.println("El total de la suma es: "+resultado);
    }

    public static int calcula(int array[], int tamaño){
        int suma = 0;
        for(int i=0; i<tamaño; i++){
            suma = suma + array[i];
        }
        return suma;
    }

}
