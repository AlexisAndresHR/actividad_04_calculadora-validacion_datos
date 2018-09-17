
package extras;

import javax.swing.JOptionPane;



public class DataValidation {
    
    public float string2Float (String valor) { // Método para validar valores de tipo "float".
        float numero = 0;
        try {
            numero = Float.parseFloat(valor);
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Error al convertir los valores. Introduce solamente números.");
            numero = 0;
        }
        return numero;
    }
    
    public int string2Int (String valor) { // Método para validar valores de tipo "int".
        int numero = 0;
        try {
            numero = Integer.parseInt(valor);
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Error al convertir los valores. Introduce solamente números.");
            numero = 0;
        }
        return numero;
    }
    
    public double string2Double (String valor) { // Método para validar valores de tipo "double".
        double numero = 0;
        try {
            numero = Integer.parseInt(valor);
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Error al convertir los valores. Introduce solamente números.");
            numero = 0;
        }
        return numero;
    }
    
}
