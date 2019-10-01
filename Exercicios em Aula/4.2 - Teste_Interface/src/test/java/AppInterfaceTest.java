import model.AnalisadorSequencia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

public class AppInterfaceTest 
{
    @Test
    public void verdadeiro() throws InterruptedException
    {
        Tela tela = new Tela();
        tela.setVisible(true);
      
        
        JTextField ent = tela.getJtfEntrada();
        JTextField saida = tela.getJtfResultado();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        th.sleep(5000);
        
        ent.setText("10,20,30,40"); 
        th.sleep(5000);
        certo.doClick();
        
 
        th.sleep(5000);
    }  
    /*
    @Test
    public void falso() throws InterruptedException
    {
        Tela tela = new Tela();
        tela.setVisible(true);
        tela.setSize(480,480);
        
        JTextField ent = tela.getJtfEntrada();
        JTextField saida = tela.getJtfResultado();        
        JButton certo = tela.getJbAnalisa();
        
               
        certo.doClick();
        saida.setText("Y,20,30,40"); 
        
        assertEquals("X", ent.setText("X,20,30,40"));
        
        Thread th = Thread.currentThread();
        th.sleep(5000);
    } */  
}
