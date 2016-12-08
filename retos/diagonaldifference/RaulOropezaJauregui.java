package hackerrank.test.retos.diagonaldifference;

import java.util.Scanner;
import static java.lang.Math.abs;

public class RaulOropezaJauregui {

    /**
     * @param args the command line arguments
     */
    public static int n;
	 public static void main(String[] args) {
	        int x, y;
	        int r=0;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Ingresa N: ");
	        n = in.nextInt();
	        System.out.println();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                System.out.print("Ingresa ["+a_i+"]["+a_j+"] : ");
	                a[a_i][a_j] = in.nextInt();
	            }
	            System.out.println();
	        }
	        x = D1(a);
	        y = D2(a);
	        r = abs(y-x);
	        System.out.println("Diferencia de diagonales: "+r);
	    }
	    public static int D1(int a [][]){
	        int aux=0;
	        int r; 
	        int x=0;
	        int y=(n-1);
	        for(int i =0 ; i< n ; i++){
	            aux = aux + a[x][y];
	            x++;
	            y--;
	        }
	        return aux;
	    }
	    
	    public static int D2(int a [][]){
	        int aux=0;
	        int x=0;
	        int y=0;
	        for(int i =0 ; i< n ; i++){
	            aux = aux + a[x][y];
	            x++;
	            y++;
	        }
	        return aux;
	    }
	    
}
