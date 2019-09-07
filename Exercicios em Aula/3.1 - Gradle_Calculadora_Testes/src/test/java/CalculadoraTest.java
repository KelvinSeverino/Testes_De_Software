import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest
{
    //instanciando classe Calculadora
    private Calculadora calc;
    
    //---------------------------------------------------------------------    
    //SOMAR
    //---------------------------------------------------------------------
    @Test
    public void somarTest()
    {        
        calc = new Calculadora();
        //sucesso
        assertEquals(1.99f, calc.somar(1.00f, 0.99f), 0.1f);        
    }

    @Test
    public void somarTestFalha()
    {        
        calc = new Calculadora();
        //falha
        assertEquals(3.99f, calc.somar(1.00f, 0.99f), 0.1f);      
    }

    //---------------------------------------------------------------------    
    //SUBTRAIR
    //---------------------------------------------------------------------    
    @Test
    public void subtrairTest()
    {        
        calc = new Calculadora();
        //sucesso
        assertEquals(4.01f, calc.subtrair(8.00f, 3.99f), 0.01f);
    }

    @Test
    public void subtrairTestFalha()
    {        
        calc = new Calculadora();

        //falha
        assertEquals(3.99f, calc.subtrair(8.00f, 3.99f), 0.01f);
    }

    //---------------------------------------------------------------------    
    //MUTIPLICAR
    //---------------------------------------------------------------------
    @Test
    public void multiplicarTest()
    {        
        calc = new Calculadora();
        //sucesso
        assertEquals(3.98f, calc.multiplicar(2.0f, 1.99f), 0.01f);
    }

    @Test
    public void multiplicarTestFalha()
    {        
        calc = new Calculadora();
        
        //falha
        assertEquals(4.00f, calc.multiplicar(3.00f, 3.00f), 0.00f);
    }

    //---------------------------------------------------------------------    
    //DIVIDIR
    //---------------------------------------------------------------------
    @Test
    public void dividirTest()
    {        
        calc = new Calculadora();
        //sucesso
        assertEquals(2.00f, calc.dividir(4.00f, 2.00f), 0.01f);
    }
    
    @Test
    public void dividirTestFalha()
    {        
        calc = new Calculadora();

        //falha
        assertEquals(0.50f, calc.dividir(3.00f, 2.00f), 0.00f);
    }
}