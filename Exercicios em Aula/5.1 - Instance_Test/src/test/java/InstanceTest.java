import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//@TestInstance(Lifecycle.PER_CLASS)
public class InstanceTest
{
    private double valor;

    public InstanceTest()
    {
        valor = Math.random();
    }

    @Test
    public void testCase01()
    {
        System.out.println(valor);
    }

    @Disabled
    @Test
    public void testCase02()
    {
        System.out.println(valor);
        //erro proposital
        assertEquals(1, 2);
    }

    @ParameterizedTest
    @ValueSource(ints={1,2,3,4})
    public void testCase03(int x)
    {
        calculadora c = new calculadora();
        assertEquals(x*x, c.quadrado(x));
    }
}