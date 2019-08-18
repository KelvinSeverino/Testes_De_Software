package Modelo;

import java.util.List;

public interface UsuarioDAO {
	
	public Usuario inserir(Usuario u);
    
    public List<Usuario> buscar(Usuario u);

}
