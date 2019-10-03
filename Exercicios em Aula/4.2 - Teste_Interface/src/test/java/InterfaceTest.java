import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.jupiter.api.Test;

import model.AnalisadorSequencia;

public class InterfaceTest
{
    //Instanciando a Tela
	Interface tela = new Interface();
	
    @Test
    public void SequenciaTrue() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();
        JTextField saida = tela.getJtfResultado();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("50,30,44,10");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("true", tela.getJtfResultado().getText());   
    }

    @Test
    public void SequenciaFalse() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();
        JTextField saida = tela.getJtfResultado();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("200,12,13,14");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("false", tela.getJtfResultado().getText());   
    }
}
