
import java.util.Arrays;
import java.util.Scanner;

public class EJEMPLO_2 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int cantidad;
        System.out.println("DIJITE EL TAMAÑO DEL VECTOR");
        cantidad=leer.nextInt();
        int miVector [] = new int [cantidad];
        
        
        for(int i=0;i<cantidad;i++){
            System.out.println("INGRESE EL VALOR DE LA POSICION: vector("+i+")");
            miVector[i]=leer.nextInt();
            System.out.println(Arrays.toString (miVector));
        }
        
    }
    
}

