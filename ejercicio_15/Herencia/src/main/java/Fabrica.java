
public class Fabrica {
    public static void main (String[] args) {
     
        Bus bus1 = new Bus();
        
        bus1.año = 2020;
        bus1.marca = "Audi";
        bus1.pasajeros = 200;
        
        System.out.println("-----------BUS-----------");
        System.out.println("AÑO:" + bus1.año);
        System.out.println("MARCA:" + bus1.marca);
        System.out.println("PASAJEROS:" + bus1.pasajeros);
        
        Camion camion1 = new Camion();
        
        camion1.año = 1998;
        camion1.marca = "Mercedes";
        camion1.carga = 5000;
        
        Camion camion2 = new Camion();
        camion2.año = 2000;
        
        System.out.println("-----------CAMION 1-----------");
        System.out.println("AÑO:" + camion1.año);
        System.out.println("MARCA:" + camion1.marca);
        System.out.println("PASAJEROS:" + camion1.carga);
        
        System.out.println("-----------CAMION 2-----------");
        System.out.println("AÑO:" + camion2.año);
        
        Automovil automovi1 = new Automovil();
        
        automovi1.año = 2015;
        automovi1.marca = "Chevrolet";
        automovi1.color = "Rojo";
        
        System.out.println("-----------AUTOMOVIL-----------");
        System.out.println("AÑO:" + automovi1.año);
        System.out.println("MARCA:" + automovi1.marca);
        System.out.println("COLOR:" + automovi1.color);
        
        
        
                
    }
    
}
