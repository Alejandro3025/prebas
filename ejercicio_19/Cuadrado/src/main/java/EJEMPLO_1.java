/**
 *
 * @author Alejandro Arias
 */

 import java.util.Arrays;
public class EJEMPLO_1 {
   
    public static void main(String[] args) {
        int mivector[]={5,7,3,90,50,2,0,-3};
        //LECTURA DEL VECTOR
        //METODO 1
        //int menor=mivector[0];
        int menor=0;
        System.out.println("IMPRESION METODO 1");
        for (int i = 0 ;i<mivector.length;i++){
            System.out.print(mivector[i]+"*");
            if(mivector[i]<menor){
                menor=mivector[i];
                System.out.println("\n EL NUMERO MENOR ES:"+menor);
            }
        }
        
        //METODO 2
        System.out.println("\n IMPRESION METODO 2");
        System.out.print(Arrays.toString(mivector));
        
        //METODO 3
        System.out.println("\n IMPRESION METODO 3");
        Arrays.stream(mivector).forEach(System.out::println);
    }
}


