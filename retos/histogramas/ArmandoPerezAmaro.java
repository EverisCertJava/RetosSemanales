package hackerrank.test.retos.histogramas;


import java.util.Scanner; // Para el ingreso de datos

public class ArmandoPerezAmaro {
      
      public static int generarV(int[] v) { // Generamos un vector
            int maxi=0;
            int maxim=200;
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < v.length; i++) {
                  int el=i+1;
                  System.out.print("Columna No. "+el+":");
                  v[i] = sc.nextInt();
                  if (v[i]>maxim)
                  {
                        System.out.print("El maximo numero de renglones es 20");
                        i--;
                  }
                  else
                  {
                        if (v[i]>maxi)
                        {
                             maxi=v[i];
                        }
                  }
            }
            return maxi;
      }
      
      public static void histogramaV(int[] v,int maxi) { // Hace el histograma
            for (int i = 0; i < maxi; i++)
            {
                  for (int j = 0; j < v.length; j++) {
                        if (i<(maxi-v[j])){
                             System.out.print("          ");
                        }
                        else
                        {
                             System.out.print("**********");
                        }
                  }
                  System.out.println("");
            }
      }
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in); // Creamos el ingreso de datos
            int maxi=0;
            
            System.out.print("Cantidad de columnas: ");
            int n = sc.nextInt(); // Almacenamos cantidad de elementos
            if (n>6)
            {
                  System.out.print("El maximo de columnas es 6");
            }
            else
            {
                  int[] v = new int[n]; // Creamos el vector

                  maxi=generarV(v); // Lo generamos
                  
                  histogramaV(v,maxi); // Mostramos el histograma
            }
      }
      
}
