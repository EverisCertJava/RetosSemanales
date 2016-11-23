package hackerrank.test.retos.plusminus;

import java.util.Scanner;

public class JemimaDelAngelSanMartin {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double positive=0.0,negative=0.0,neutral=0.0;
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if (arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else {
                neutral++;
            }
    }        
    System.out.println(String.format("%.6f", Float.parseFloat((positive/n)+"")));
    System.out.println(String.format("%.6f", Float.parseFloat((negative/n)+"")));
    System.out.println(String.format("%.6f", Float.parseFloat((neutral/n)+"")));
    }
}
