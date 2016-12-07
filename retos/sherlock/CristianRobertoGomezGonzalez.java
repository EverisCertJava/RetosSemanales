package hackerrank.test.retos.sherlock;

import java.util.Scanner;

public class CristianRobertoGomezGonzalez {

    public static void main(String[] args) {
        boolean n = false, n2 =false;
        int tamc1=0,tamc2=0,valorn;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir: n k q");
        String cadena = entrada.nextLine();
        String[] cadsep = cadena.split("\\ ");//Primer cadena (n,k,q)
    
        valorn = Integer.parseInt(cadsep[0]);//Numero de elementos de la segunda cadena
        String[] cadsep2 = new String[valorn];    
        do{
        System.out.println("Introducir "+cadsep[0]+ " elementos: ");
        String cadena2 = entrada.nextLine();
        cadsep2 = cadena2.split("\\ ");
        
        tamc2=cadsep2.length;
        if(tamc2==valorn)
            n=true;
        else
            System.out.println("Error no coincide el numero de elementos");
        }
        while(n==false);
    
        System.out.println("Introducir "+cadsep[2]+ " preguntas: ");//Seccion de preguntas
        int valorq = Integer.parseInt(cadsep[2]);
        String[] PreguntasQ = new String[valorq];
        for(int i=0;i<valorq;i++){
            do{
                int valida = Integer.parseInt(entrada.nextLine());
                if(valida<valorn){
                    PreguntasQ[i] = String.valueOf(valida);
                    n2 = true;
                }
                else{
                    System.out.println("La posicion no existe, ingresa otra");
                    n2 = false;
                }
            }while(n2==false);
        }
        
        String temp1=cadsep2[0],temp2="";//Rotaciones
        for(int i=0; i<Integer.parseInt(cadsep[1]); i++){
            for(int i2=0; i2<tamc2; i2++){
                if(i2 == (tamc2-1)){
                    //temp=cadsep2[tamc2-1];
                    cadsep2[0]=temp1;
                }
                else{
                    temp2=cadsep2[i2+1];
                    cadsep2[i2+1]=temp1;
                    temp1=temp2;
                }
            }
        }
        //Imprime
       // System.out.println("Se realizaron "+cadsep[1]+" rotaciones");
        for(int i=0; i<PreguntasQ.length; i++){
            int indice = Integer.parseInt(PreguntasQ[i]);
            System.out.println(cadsep2[indice]);
        }
    }
}