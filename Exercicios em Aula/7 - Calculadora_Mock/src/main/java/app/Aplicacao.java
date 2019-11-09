package app;

import org.mockito.Mockito;
import model.Calculadora;

public class Aplicacao
{
    public static void main(String[] args)
    {
        System.out.println("Efetuando o 'mock' da calculadora e reproduzindo o resultado: ");
        
        Calculadora mockCalc = Mockito.mock(Calculadora.class);
        Mockito.when(mockCalc.somar(1f, 1f)).thenReturn(2f);

        System.out.println(mockCalc.somar(1f, 1f));
    }
}