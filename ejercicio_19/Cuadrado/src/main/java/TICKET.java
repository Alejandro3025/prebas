//determinar un precio de un tiket de ida y de vuelta conociendo la distancia a recorrer y sabiendo que el numero 
//de dias de estancia es superior a 7 y la distancia superior a 800km el tiket tiene una reduccion del 30%, 
//el precio por km es de $25.000 pesos.
import java.util.Scanner;
       
public class TICKET {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("------------------------------------------------------------");
        System.out.println("BIENVENIDO A NUESTRA PLATAFORMA DIGITAL DE NUESTRA AEROLINEA");
        System.out.println("------------------------------------------------------------");
        
        //INFONRMACION DEL USUARIO QUE ADQUIERE EL TICKET
        System.out.println("Señor Usuario Por favor indiqueme cual es su nombre:");
        String nom = leer.nextLine();
        
        //SE LE PREGUNTA A CUANTOS KILOMETROS ESTA DE SU DESTINO PARA PODER HACER EL CALCULLO Y SABER 
        //SI CUENTA CON DESCUENTO O NO
        System.out.println("Señor Usuario Por favor digite de cuantos kilometros esta de su destino:");
        String km = leer.nextLine();  
        
        System.out.println("Señor usuario por favor digite el numero de dias que tiene de estadia");
        
        
        System.out.println("SU NOMBRE ES"+nom);
        System.out.println(km);
        
    }
}
