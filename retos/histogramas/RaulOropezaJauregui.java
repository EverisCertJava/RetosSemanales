package hackerrank.test.retos.histogramas;

import java.util.Scanner;

public class RaulOropezaJauregui {
	 public static int [][] histograma;
	    public static int alto;
	    public static int ancho;
	    public static int [][] dibujo;
	    public static int array[];
	    public static int array2[];
	    public static int numAsteriscos;
	    public static void main(String[] args) {
	        int n; 
	        int mayor;
	        int numAstXCols;
	        Scanner leer = new Scanner(System.in);
	        System.out.print("Ingresa el numero de barras: ");
	        n = leer.nextInt();
	        ancho = n;
	        numAstXCols = 60/n;
	        System.out.println();
	        array = new int [n];
	        for(int i=0; i<n; i++){
	            System.out.print("Ingresa el dato "+(i+1)+" : ");
	            array[i] = leer.nextInt();
	            System.out.println();
	        }
	        mayor = NumMayor(array);
	        //Quitar linea de abajo
	        System.out.println("El numero mayor es: "+ mayor);
	        //Quitar linea de abajo
	        numAsteriscos = NumAsteriscos(mayor);
	        System.out.println("El numero numero de * es : "+ numAsteriscos);
	        
	        System.out.println("Alto: "+alto);
	        System.out.println("Ancho: "+ancho);
	                
	        NumAstArray();
	        llenaHistograma();
	        ImprimeArray();
	        
	        
	        imprimeHisto2();
	        
	        imprimeHisto();
	        
	    }
	    
	    public static int NumMayor(int array[]){
	        int NumMayor = 0;
	        for (int i=0; i<array.length; i++){
	            if(array[i] > NumMayor){
	                NumMayor = array[i];
	            }
	        }
	        return NumMayor;
	    }
	    
	    public static int NumAsteriscos(int numero){
	        int resultado = 0;
	        int v10 = 10;
	        int v20 = 20;
	        resultado = numero/v10;
	        //System.out.println(resultado);
	        alto = resultado;
	        resultado = v20/resultado;
	        return resultado;
	    }
	    
	    public static void NumAstArray(){
	        array2 = new int [array.length];
	        for(int i=0; i< array.length; i++){
	            System.out.println("Array: "+array[i]);
	            
	            array2[i] = array[i]/10;
	            System.out.println("Array2: "+array2[i]);
	        }
	    }
	    
	    public static void llenaHistograma(){
	        int cont=0;
	        int cont2=1;
	        dibujo = new int [alto][ancho];
	        System.out.println("Se inicializa el Histograma: "+alto+","+ancho);
	        System.out.println("Alto: "+alto);
	        System.out.println("Ancho: "+ancho);
	        histograma = new int [alto][ancho];
	            for(int i=0; i <ancho; i++){
	                for(int j=(alto-1); j>-1; j--){
	                //inicia y mete num asteriscos
	                System.out.println("Pos llenando histo: ["+j+"]["+i+"] ");
	                System.out.println("cont2: "+cont2);
	                if(array2[cont] >= cont2)
	                        histograma[j][i] = numAsteriscos;
	                else{
	                    histograma[j][i] = 0;
	                }
	                cont2++;
	            }
	            cont2=1;
	            cont++;
	        }
	    }
	    
	    public static void ImprimeArray(){
	        for(int i=0; i <ancho-1; i++){
	                for(int j=(alto-1); j>-1; j--){
	        System.out.println("Pos: ["+j+"]["+i+"] : "+histograma[j][i]);
	                }
	        }
	        
	        for(int i=0; i <ancho-1; i++){
	                for(int j=(alto-1); j>-1; j--){
	        System.out.println("Pos: ["+j+"]["+i+"] : "+histograma[j][i]);
	                }
	        }
	    }
	    
	    public static void imprimeHisto(){
	        for(int i=0; i<alto; i++){
	            System.out.print("[");
	           for(int j=0; j<ancho; j++){
	                    System.out.print(""+histograma[i][j]+" ");
	            }
	            System.out.println("}");
	        }
	    }
	    
	    public static void imprimeHisto2(){
	        int linea=0;
	        
	            for(int j=alto-1; j>-1; j--){
	                for(int i=ancho-1; i > -1; i--){
	                    //System.out.print(""+histograma[i][j]+" ");
	                    linea = histograma[j][i];
	                    System.out.print("Linea: "+linea+"Pos: ["+j+"]["+i+"]");
	                    if(linea > 0){
	                    for(int x=linea; x > 0 ; x--){
	                        for(int z=0; z<10; z++){
	                            System.out.print("*");
	                        }
	                        System.out.println();
	                    }
	                    }else{
	                        for(int x=linea; x > 0 ; x--){
	                        for(int z=0; z<10; z++){
	                            System.out.print("x");
	                        }
	                        //System.out.println();
	                    }
	                    }
	                    System.out.println();
	            }
	        }
	    }
}
