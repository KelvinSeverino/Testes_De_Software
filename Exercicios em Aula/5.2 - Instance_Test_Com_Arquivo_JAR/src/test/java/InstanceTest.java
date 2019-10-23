import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import model.CalculadorAluguel;

//@TestInstance(Lifecycle.PER_CLASS)
public class InstanceTest
{
    CalculadorAluguel aluguel = new CalculadorAluguel(500);
    
    @ParameterizedTest
    @CsvSource(value={"1:450","6:475","11:500","14:500"},
               delimiter=':')
    public void testCase03(int dia, int resultado)
    {
        assertEquals(resultado, aluguel.calcAluguel(dia), 0.01);
    }
}