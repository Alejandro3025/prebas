
package run;

import controller.ControllerStudens;
import view.viewStudiens;

/**
 *
 * @author Alejandro Arias
 */
public class Runner {
    
    public static void main(String[] args) {
        viewStudiens vista = new viewStudiens();
        ControllerStudens controlador = new ControllerStudens(5, vista);
        controlador.ejecutar();
    }
}
