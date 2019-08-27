package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

public class UsuarioDAOStub implements UsuarioDAO{
	
	public int contBuscar;
	public int contInserir;
	
	public UsuarioDAOStub() 
	{
		//Funcionalidade Spy do Stub
		this.contInserir = 0;
		this.contBuscar = 0;
	}

	public Usuario inserir(Usuario u)
	{
		++this.contInserir; //Funcionalidade Spy do Stub
		switch(u.getNomeUsuario()) 
		{
		case"fabricio":
			u.setId(new Integer(1));
			break;
		
		case "rony":
			u.setId(new Integer(2));
			break;
		default:
			return null;	
		}
		return u;
	}
	
	public List<Usuario> buscar(Usuario u)
	{
		
		++this.contBuscar; //Funcionalidade Spy do Stub
		List<Usuario> usuarios = new ArrayList();
		List<Usuario> usuariosAchados = new ArrayList();
		
		Usuario uNovo = new Usuario();
		
		uNovo.setId(new Integer(1));
		uNovo.setNomeUsuario("fabricio");
		
		usuarios.add(uNovo);
		
		for(Usuario ubd : usuarios)
		{
			if(ubd.getNomeUsuario().equals(u.getNomeUsuario()))
			{
				usuariosAchados.add(ubd);
			}			
		}
		return usuariosAchados;
	}
}
