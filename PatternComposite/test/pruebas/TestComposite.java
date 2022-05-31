package pruebas;

import Composite.Resta;
import Composite.Division;
import Composite.Multiplicacion;
import Composite.Suma;
import Composite.Constante;
import Composite.Expresion;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sroa
 */
public class TestComposite {

    @Test
    public void testConstante() {
        double testValor = 3.0;
        Expresion e = new Constante(testValor);
        assertEquals(testValor, e.getValor(), 0.0);//comparar

    }

    @Test
    public void testSuma() {
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Constante(testValorA);//pasamos al constructor el valor A
        Expresion derecha = new Constante(testValorB); //creamos otra expresion y pasamos el valor B
        Expresion e = new Suma(izquierda, derecha);
        assertEquals(testValorA + testValorB, e.getValor(), 0.0);

    }

    //RESTA
    @Test
    public void testResta() {
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Constante(testValorA);//pasamos al constructor el valor A
        Expresion derecha = new Constante(testValorB); //creamos otra expresion y pasamos el valor B
        Expresion e = new Resta(izquierda, derecha);
        assertEquals(testValorA - testValorB, e.getValor(), 0.0);

    }

    //MULTIPLICACION
    @Test
    public void testMultiplicacion() {
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Constante(testValorA);//pasamos al constructor el valor A
        Expresion derecha = new Constante(testValorB); //creamos otra expresion y pasamos el valor B
        Expresion e = new Multiplicacion(izquierda, derecha);
        assertEquals(testValorA * testValorB, e.getValor(), 0.0);

    }

    //DIVISION
    @Test
    public void testDivision() {
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Constante(testValorA);//pasamos al constructor el valor A
        Expresion derecha = new Constante(testValorB); //creamos otra expresion y pasamos el valor B
        Expresion e = new Division(izquierda, derecha);
        assertEquals(testValorA / testValorB, e.getValor(), 0.0);

    }

    @Test
    public void testExpresionComnpleja() { //definir expresion derecha y expresion izquierda
        Expresion e
                = new Division(
                        new Multiplicacion(
                                new Suma(
                                        new Constante(4.0),
                                        new Constante(6.0)
                                ),
                                new Constante(200.0)
                        ),
                        new Suma(
                                new Constante(3),
                                new Constante(83)
                        )
                );
        assertEquals(23.2558, e.getValor(),0.0001);
        
    }
}
