import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import model.CalculadorAluguel;

//@TestInstance(Lifecycle.PER_CLASS)
public class InstanceTest
{
    VerificaString verifica = new VerificaString();

    CalculadorAluguel aluguel = new CalculadorAluguel(500);
    
    //--------------------------------------------------------------------------------
    // Teste parametrizado CsvSource para rodar varios testes dentro um caso de teste
    //--------------------------------------------------------------------------------
    @ParameterizedTest
    @CsvSource(value={"0:-1","1:450","2:450","11:500","14:500","32:-1"},
               delimiter=':')
    public void testeParametrizadoCsv(int dia, int resultado)
    {
        assertEquals(resultado, aluguel.calcAluguel(dia), 0.01);
    }

    //---------------------------------------------------------------------------
    // Teste parametrizado utilizando um arquivo externo CSV
    //---------------------------------------------------------------------------
    @ParameterizedTest(name = "Teste {index} => dia={0}," + " resultado={1}")
    @CsvFileSource(resources = "valores_test.csv",
               delimiter=',')
    public void testeParametrizadoComArquivoCsv(int dia, int resultado)
    {
        assertEquals(resultado, aluguel.calcAluguel(dia), 0.01);
    }

    //---------------------------------------------------------------------------
    // Teste Repetido
    //---------------------------------------------------------------------------
    @RepeatedTest(3)
    public void checarTestBloqueio(RepetitionInfo repetitionInfo)
    {
        assertFalse(verifica.ChecarString("erro"));

        if (repetitionInfo.getCurrentRepetition() >= 3)
        {
            assertTrue(verifica.stringBloqueada());
        }
    }
}