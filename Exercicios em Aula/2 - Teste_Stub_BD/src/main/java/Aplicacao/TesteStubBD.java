package Aplicacao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Modelo.UsuarioDAOBD;
import Modelo.UsuarioDAOStub;

public class TesteStubBD {
	public static void main(String[] args) 
	{
		/*ABAIXO TEMOS A INSERCAO E BUSCA REALIZADA PELO HIBERNATE COM BANCO DE DADOS*/
		UsuarioDAO ubd = new UsuarioDAOBD();
		Usuario u = new Usuario();
		
		//setando Usuario e ID
		u.setNomeUsuario("Kelvin");
		u.setId(25);
		
		//adicionando usuario ao metodo inserir
		ubd.inserir(u);		
		
		//buscando ususario na lista
		List<Usuario> uLista = ubd.buscar(u);
		
		try
		{
			Field b = UsuarioDAOBD.class.getDeclaredField("contBuscar");
			System.out.println("Spy de Busca: "+b.get(ubd));
			
			Field i = UsuarioDAOBD.class.getDeclaredField("contInserir");			
			System.out.println("Spy de Inserção: "+i.get(ubd));
		}
		catch(Exception e)
		{
			System.out.println("Erro de acesso a campo");
		}	
		
		/* ABAIXO TEMOS A INSERCAO E BUSCA SIMULADA PELO STUB
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
		*/		
	}
}
