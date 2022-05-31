
package Composite;

import Composite.Expresion;

public class Multiplicacion extends ExpresionBinaria {
   

    public Multiplicacion(Expresion izquierda, Expresion derecha) {
    super(izquierda,derecha);
    }

    @Override
    public double getValor() {
        
         return this.izquierda.getValor()*this.derecha.getValor();  
        
    }
    
}
