import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest
{
    private Calculadora calc;

    //gradle jacocoTestReport
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
    public void dividirTestErro()
    {        
        calc = new Calculadora();
        //erro
        assertEquals(0.00f, calc.dividir(4.00f, 2.00f), 0.01f);
    }
    
/*
    @ParameterizedTest
    @CsvSource(value={"4:2"},
               delimiter=':')
    public void testeParametrizadoCsv(Float x, Float y)
    {
        assertEquals(2.00f, calc.dividir(x, y), 0.01f);
    }
    */
}
