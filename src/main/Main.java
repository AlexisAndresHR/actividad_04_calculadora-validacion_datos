
package main;

import views.viewCalculadora;
import models.modelCalculadora;
import controllers.controllerCalculadora;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ...
        modelCalculadora modelcalculadora = new modelCalculadora();
        viewCalculadora viewcalculadora = new viewCalculadora();
        controllerCalculadora controllercalculadora = new controllerCalculadora(modelcalculadora, viewcalculadora);
    }
    
}
