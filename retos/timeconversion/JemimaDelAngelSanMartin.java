package hackerrank.test.retos.timeconversion;

import java.util.Scanner;

public class JemimaDelAngelSanMartin {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String tipo= time.charAt(time.length()-2)+""+time.charAt(time.length()-1);
        System.out.println(format24hour(time,tipo));
        
    }
    public static String format24hour(String time, String tipo){
        int hora= Integer.parseInt(time.charAt(0)+""+time.charAt(1));
        if(tipo.equals("PM")){
            if(hora!=12){
                hora+=12;
            }
            time=hora+""+time.substring(2, time.length()-2); 
        }
        else if(tipo.equals("AM")){
            if(hora==12){
            time="00"+time.substring(2, time.length()-2); 
            }
            else{time=time.substring(0, time.length()-2); }
        }
       
        return time;
    }
}
