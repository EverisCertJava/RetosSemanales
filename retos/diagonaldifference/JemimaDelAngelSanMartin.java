package hackerrank.test.retos.diagonaldifference;

import java.util.Scanner;

public class JemimaDelAngelSanMartin {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        int dif,sum1=0,sum2=0;
	        for(int i=0; i < n; i++){
	            for(int j=0; j < n; j++){
	                a[i][j] = in.nextInt();
	                if (i==j){
	                    sum1+=a[i][j];
	                }     
	            }
	            sum2+=a[i][n-(i+1)];
	        }
	        dif=sum1-sum2;
	        System.out.println(Absoluto(dif));
	    }
	    public static int Absoluto(int num){
	        if(num<0){
	            num=num*-1;
	        }
	        return num;
	    }
}
