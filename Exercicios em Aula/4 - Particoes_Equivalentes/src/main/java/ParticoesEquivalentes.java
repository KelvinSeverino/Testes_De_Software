public class ParticoesEquivalentes
{
    public int EntradaDeString(String entrada_str)
    {   
		if(entrada_str.length() == 0)
        {
            return -2;
        } 
		else if(entrada_str.length() > 5) 
        {
            return -3;
        }
        else 
        {
            //retorna 1
            return entrada_str.indexOf("@");
        }	
    }
}