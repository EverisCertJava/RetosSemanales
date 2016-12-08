package retos.sherlock;

import java.util.Scanner;

public class ArmandoPerezAmaro {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Otorga n(longitud del arreglo),k(numero de vueltas) y m(numero de preguntas)");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        int ar[] =new int[n];
        //System.out.println("Otorga los datos del vector:");
        //Scanner sv = new Scanner(System.in);
        //introducimos los datos al vector
        for (int i=0; i<ar.length; i++){
                   //ar[i]=sv.nextInt();
                   ar[i]=sc.nextInt();
        }
        //Damos las vueltas que solicitan
        int tmp;
        for (int j=0;j<k;j++){
                   tmp=ar[ar.length-1];
                   //System.out.println("tmp "+tmp);
                   for (int l=ar.length-1;l>0;l--){
                               ar[l]=ar[l-1];
                               //System.out.println("ar[l+1] "+ar[l+1]);
                   }
                   ar[0]=tmp;
        }
        int arrp[] = new int[m];
        for(int i=0;i<m;i++){
                   //Scanner sp =new Scanner(System.in);
                   //int borr=i+1;
                   //System.out.println("Otorga la pregunta: "+borr);
                   //arrp[i]=sp.nextInt();
                   arrp[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
                   //System.out.println("Resultado dato en la aposición del arreglo "+arrp[i]+" es "+ar[arrp[i]]);
                   System.out.println(ar[arrp[i]]);
        }
}

}
