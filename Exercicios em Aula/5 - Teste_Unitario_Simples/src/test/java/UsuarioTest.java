import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class UsuarioTest
{
    private static List<Usuario> usuarios;

    @BeforeAll
    public static void init()
    {
        Usuario u = new Usuario();
        u.setId(new Long(1));
        u.setUsername("kelvin");

        usuarios = new ArrayList();
        usuarios.add(u);

        u = new Usuario();
        u.setId(new Long(3));
        u.setUsername("fulano");
        usuarios.add(u);
    }

    @Test
    public void TestBusca1() 
    {
        Usuario u_achado = null;
        for(Usuario u: usuarios)
        {
            if(u.getId() == 1L)
            {
                u_achado = u;
                break;
            }
        }

        Usuario u = new Usuario();
        u.setId(1L);
        u.setUsername("kelvin");

        assertEquals(u_achado, u);
    }
}