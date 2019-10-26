/*public class usuario {
	
	public int id;	
	
    public String nomeUsuario;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
}*/

public class VerificaString
{
    private static int contErro = 0;
    
    public void VerficaString()
    {
        
    }

    public boolean ChecarString(String Str)
    {
        if(!Str.equals("xyz"))
        {
            contErro += 1;
            return false;
        }
        return true;
    }

    public boolean stringBloqueada()
    {
        return (contErro >= 3);
    }
}
