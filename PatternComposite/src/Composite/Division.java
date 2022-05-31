/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

import Composite.Expresion;

/**
 *
 * @author sroa
 */
public class Division extends ExpresionBinaria {
  
    public Division(Expresion izquierda, Expresion derecha) {
      super(izquierda,derecha);
        
        
    }

    @Override
    public double getValor() {
          return this.izquierda.getValor()/this.derecha.getValor();  
        
    }
    
}
