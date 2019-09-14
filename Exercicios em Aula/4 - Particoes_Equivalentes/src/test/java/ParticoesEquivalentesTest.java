import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ParticoesEquivalentesTest
{
    private ParticoesEquivalentes particoeEqui;

    //Válida 1 - Contem um @
    @Test
    public void stringValido()
    {
        particoeEqui = new ParticoesEquivalentes();
        //sucesso
        assertEquals(3, particoeEqui.EntradaDeString("aaa@"));
    }

    //Válida 2 - NÃO Contem @
    @Test
    public void stringNaoEncontrado()
    {
        particoeEqui = new ParticoesEquivalentes();
        //sucesso
        assertEquals(-1, particoeEqui.EntradaDeString("aaaa"));
    }

    //Válida 3 - Contem mais de um @
    @Test
    public void stringValidoSegundo()
    {
        particoeEqui = new ParticoesEquivalentes();
        //sucesso
        assertEquals(3, particoeEqui.EntradaDeString("axa@@"));
    }    

    //Válida 4 - Uma String vazia
    @Test
    public void stringVazio()
    {
        particoeEqui = new ParticoesEquivalentes();
        //sucesso
        assertEquals(-2, particoeEqui.EntradaDeString(""));
    }

    //Válida 5 - Contem o @ num conjunto de 5 ou mais caracteres
    @Test
    public void stringMaiorQueCinco()
    {
        particoeEqui = new ParticoesEquivalentes();
        //sucesso
        assertEquals(-3, particoeEqui.EntradaDeString("aaaaa@"));
    }
}
