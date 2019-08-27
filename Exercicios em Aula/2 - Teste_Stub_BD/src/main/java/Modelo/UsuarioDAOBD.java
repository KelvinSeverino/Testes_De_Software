package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

public class UsuarioDAOBD implements UsuarioDAO{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("testebd");        
    EntityManager em = emf.createEntityManager();
	
	public int contBuscar;
	public int contInserir;
	
	public UsuarioDAOBD() 
	{
		//Funcionalidade Spy do Stub
		this.contInserir = 0;
		this.contBuscar = 0;
	}

	public Usuario inserir(Usuario u)
	{
		++this.contInserir; //Funcionalidade Spy do Stub
        
        Usuario u0 = new Usuario();
        u0.setNomeUsuario(u.getNomeUsuario());
        u0.setId(u.getId());
        em.getTransaction().begin();
        em.persist(u0);
        em.getTransaction().commit();
        
		return null;		
	}
	
	public List<Usuario> buscar(Usuario u)
	{		
		++this.contBuscar; //Funcionalidade Spy do Stub
		
		Query query = em.createQuery("SELECT u FROM Usuario u");
		List<Usuario> usuarios = query.getResultList();
		
        for(Usuario ui: usuarios){
            System.out.println("Nome: " + ui.getNomeUsuario() + " Id: " + ui.getId() );
        } 
        
		return usuarios;
	}
}
