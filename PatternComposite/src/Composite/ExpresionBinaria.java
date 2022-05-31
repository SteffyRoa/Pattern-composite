
package Composite;
//debe de implemetar la interfaz expresion
public abstract class ExpresionBinaria implements Expresion  {
    //atributos
    protected Expresion izquierda;
    protected Expresion derecha;
    
    



//definir el constructor
    public ExpresionBinaria(Expresion izquierda, Expresion derecha){
        this.izquierda=izquierda;
        this.derecha=derecha;
    
}
        
    
}
