package hackerrank.test.retos.verybigsum;

import java.util.Scanner;

public class JemimaDelAngelSanMartin {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        long sum=0;
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	            sum+=arr[i];
	        }
	        System.out.println(sum);
	    }
}
