
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.viewCalculadora;
import models.modelCalculadora;

import extras.DataValidation; // Acceso a la clase "DataValidation".


public class controllerCalculadora {
    
// Objetos para acceder a los valores de las interfaces.
    viewCalculadora viewcalculadora;
    modelCalculadora modelcalculadora;
    
    DataValidation dataValidation = new DataValidation(); // Objeto para acceder a la clase "DataValidation".
    
    
    ActionListener actionlistener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewcalculadora.jb_suma) {
                jb_suma_action_performed();
            }
            else if (e.getSource() == viewcalculadora.jb_resta) {
                jb_resta_action_performed();
            }
            else if (e.getSource() == viewcalculadora.jb_multiplicacion) {
                jb_multiplicacion_action_performed();
            }
            else if (e.getSource() == viewcalculadora.jb_division) {
                jb_division_action_performed();
            }
            else if (e.getSource() == viewcalculadora.jb_modulo) {
                jb_modulo_action_performed();
            }
            
            else if (e.getSource() == viewcalculadora.jb_limpiar) {
                jb_limpiar_action_performed();
            }
        }
    };
    
    
    public controllerCalculadora(modelCalculadora ModelCalc, viewCalculadora ViewCalc) {
        this.viewcalculadora = ViewCalc;
        this.modelcalculadora = ModelCalc;
        
        this.viewcalculadora.jb_suma.addActionListener(actionlistener);
        this.viewcalculadora.jb_resta.addActionListener(actionlistener);
        this.viewcalculadora.jb_multiplicacion.addActionListener(actionlistener);
        this.viewcalculadora.jb_division.addActionListener(actionlistener);
        this.viewcalculadora.jb_modulo.addActionListener(actionlistener);
        this.viewcalculadora.jb_limpiar.addActionListener(actionlistener);
        initComponents();
    }
    
// Métodos para la obtención y asignación de valores para las operaciones.
    public void obtencion() {
        modelcalculadora.setNumero1(dataValidation.string2Float(viewcalculadora.jtf_numero1.getText()));
        modelcalculadora.setNumero2(dataValidation.string2Float(viewcalculadora.jtf_numero2.getText()));
    }
    public void asignacion() {
        modelcalculadora.setCad_resultado(Float.toString(modelcalculadora.resultado));
        viewcalculadora.jl_resultado.setText("El resultado es: " + modelcalculadora.getCad_resultado());
    }
    
// Acciones de botones de la Calculadora.
    public void jb_suma_action_performed() {
        this.obtencion();
        modelcalculadora.suma();
        this.asignacion();
    }
    public void jb_resta_action_performed() {
        this.obtencion();
        modelcalculadora.resta();
        this.asignacion();
    }
    public void jb_multiplicacion_action_performed() {
        this.obtencion();
        modelcalculadora.multiplicacion();
        this.asignacion();
    }
    public void jb_division_action_performed() {
        this.obtencion();
        modelcalculadora.division();
        this.asignacion();
    }
    public void jb_modulo_action_performed() {
        this.obtencion();
        modelcalculadora.modulo();
        this.asignacion();
    }
    
    public void jb_limpiar_action_performed() {
        viewcalculadora.jtf_numero1.setText("");
        viewcalculadora.jtf_numero2.setText("");
        viewcalculadora.jl_resultado.setText("El resultado es: ");
    }
    
// Método para acceder a los componentes de viewCalculadora.
    public void initComponents() {
        viewcalculadora.setVisible(true);
    }
    
}
