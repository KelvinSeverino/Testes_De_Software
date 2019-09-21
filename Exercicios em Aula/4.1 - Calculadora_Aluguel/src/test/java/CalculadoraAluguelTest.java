import model.CalculadorAluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraAluguelTest
{
    CalculadorAluguel aluguel = new CalculadorAluguel(500);
    
    // Até o 5º Dia do Mês tem desconto de 10% sobre 500
    //--------------------------------
    // Extremo do DIA 1 (0,1,2)
    //--------------------------------
    @Test
    public void dia0()
    {
        assertEquals(-1, aluguel.calcAluguel(0), 0.01);
    }

    @Test
    public void dia1()
    {
        assertEquals(450, aluguel.calcAluguel(1), 0.01);
    }

    @Test
    public void dia2()
    {
        assertEquals(450, aluguel.calcAluguel(2), 0.01);
    }

    // Até o 5º Dia do Mês tem desconto de 10% sobre 500
    //--------------------------------
    // Extremo do DIA 5 (4,5,6)
    //--------------------------------
    @Test
    public void dia4()
    {
        assertEquals(450, aluguel.calcAluguel(4), 0.01);
    }

    @Test
    public void dia5()
    {
        assertEquals(450, aluguel.calcAluguel(5), 0.01);
    }

    //Bug inserido pelo Professor no arquivo JAR
    @Test
    public void dia6()
    {
        assertEquals(475, aluguel.calcAluguel(6), 0.01);
    }

    // Até o 10º Dia do Mês tem desconto de 5% sobre 500
    //--------------------------------
    // Extremo do DIA 10 (9,10,11)
    //--------------------------------
    @Test
    public void dia9()
    {
        assertEquals(475, aluguel.calcAluguel(9), 0.01);
    }

    @Test
    public void dia10()
    {
        assertEquals(475, aluguel.calcAluguel(10), 0.01);
    }

    @Test
    public void dia11()
    {
        assertEquals(500, aluguel.calcAluguel(11), 0.01);
    }

    // Até o 15º Dia do Mês o valor é normal de 500
    //--------------------------------
    // Extremo do DIA 15 (14,15,16)
    //--------------------------------
    @Test
    public void dia14()
    {
        assertEquals(500, aluguel.calcAluguel(14), 0.01);
    }

    //Bug inserido pelo Professor no arquivo JAR
    @Test
    public void dia15()
    {
        assertEquals(500, aluguel.calcAluguel(15), 0.01);
    }

    // Após 15º Dia haverá Multa de 2% mais juros de 1% ao mês 
    @Test
    public void dia16()
    {
        assertEquals(510.25, aluguel.calcAluguel(16), 0.01);
    }

    //--------------------------------
    // Extremo do DIA 31 (30,31,32)
    //--------------------------------
    @Test
    public void dia30()
    {
        assertEquals(513.75, aluguel.calcAluguel(30), 0.01);
    }

    @Test
    public void dia31()
    {
        assertEquals(510.25, aluguel.calcAluguel(31), 0.01);
    }

    @Test
    public void dia32()
    {
        assertEquals(-1, aluguel.calcAluguel(32), 0.01);
    }
}