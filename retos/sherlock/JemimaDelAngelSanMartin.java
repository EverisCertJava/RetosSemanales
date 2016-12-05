package hackerrank.test.retos.sherlock;

import java.util.Scanner;

public class JemimaDelAngelSanMartin {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int cont=0;
        int arreglo_rotado[]=new int[n];
        if(k>n){
            k=k%n;
        }
        for(int i=n-k;i<n;i++, cont++){
            arreglo_rotado[cont]=a[i];                
        }
        for(int i=0;i<n-k;i++,cont++){
            arreglo_rotado[cont]=a[i]; 
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(arreglo_rotado[m]);
        }
        
    }
}
