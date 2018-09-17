
package models;


public class modelCalculadora {
    
    public float numero1;
    public float numero2;
    
    public float resultado;
    public String cad_resultado;
    
    
    public float getNumero1() {
        return numero1;
    }
    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public String getCad_resultado() {
        return cad_resultado;
    }
    public void setCad_resultado(String cad_resultado) {
        this.cad_resultado = cad_resultado;
    }
    
// Métodos de operaciones.
    public void suma() {
        resultado = numero1 + numero2;
    }
    
    public void resta() {
        resultado = numero1 - numero2;
    }
    
    public void multiplicacion() {
        resultado = numero1 * numero2;
    }
    
    public void division() {
        resultado = numero1 / numero2;
    }
    
    public void modulo() {
        resultado = numero1 % numero2;
    }
    
}
