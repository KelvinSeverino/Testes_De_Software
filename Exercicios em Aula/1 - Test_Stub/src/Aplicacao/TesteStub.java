package Aplicacao;

import java.lang.reflect.Field;
import java.util.List;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Modelo.UsuarioDAOStub;

public class TesteStub {
	public static void main(String[] args) 
	{
		UsuarioDAO udao = new UsuarioDAOStub();
		Usuario u = new Usuario();
		
		u.setNomeUsuario("fabricio");
		
		for(int i = 0; i<100; ++i)
		{
			u = udao.inserir(u);
		}
		
		List<Usuario> uLista = udao.buscar(u);
		
		u = udao.inserir(u);
		
		System.out.println(u.getId());
		
		try
		{
			Field f = UsuarioDAOStub.class.getDeclaredField("contInserir");
			Field f2 = UsuarioDAOStub.class.getDeclaredField("contBuscar");
			System.out.println(f.get(udao));
			System.out.println(f2.get(udao));
		}
		catch(Exception e)
		{
			System.out.println("Erro de acesso a campo");
		}
	}

}
