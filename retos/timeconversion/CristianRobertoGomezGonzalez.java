package hackerrank.test.retos.timeconversion;

import java.util.Scanner;

public class CristianRobertoGomezGonzalez {
	
	public static void main(String []args){
        
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();
        String csep = cadena.substring(8);
        
        if(csep.equals("PM")){
            if(Integer.parseInt(cadena.substring(0,2))==12){
                System.out.println(cadena.substring(0,8));   
                return;
            }
            int valor = Integer.parseInt(cadena.substring(0,2))+12;
            System.out.println(Integer.toString(valor)+cadena.substring(2,8)); 
        }
        else{
            if(Integer.parseInt(cadena.substring(0,2))==12){
                System.out.println("00"+cadena.substring(2,8));   
                return;
            }
            System.out.println(cadena.substring(0,8));
        }
     }
}
