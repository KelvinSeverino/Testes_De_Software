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

    @Test
    public void SequenciaMaiorCampos() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();      
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("200,12,13,14,15");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("false", tela.getJtfResultado().getText());   
    }
    
    @Test
    public void LimparCampos() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();
        JButton limpar = tela.getJbLimpar();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("250,15,16,17");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao limpar
        limpar.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("", tela.getJtfEntrada().getText());
        assertEquals("", tela.getJtfResultado().getText());   
    }

    @Test
    public void TesteVazio() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText(",,,,");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("false", tela.getJtfResultado().getText());   
    }

    @Test
    public void TesteVazioComValor() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText(",,15,,");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("false", tela.getJtfResultado().getText());   
    }

    @Test
    public void AnalisadorSequencia(){
        assertEquals(true, AnalisadorSequencia.analisar("50,30,44,10"));
    }  
    @Test
    public void AnalisadorSequenciaError(){
        assertEquals(true, AnalisadorSequencia.analisar("200,12,13,14"));
    }    

    //BUG 1
    @Test
    public void SequenciaErroBug1() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("09,30,40,40");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("false", tela.getJtfResultado().getText());   
    }  
    
    //BUG 2
    @Test
    public void SequenciaErroBug2() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("09,30,20,40");

        //Exibe a tela por 3 segundos
        th.sleep(3000);

        //Realiza um click no botao certo
        certo.doClick();

        //Exibe a tela por 3 segundos
        th.sleep(3000);
        
        //Teste
        assertEquals("false", tela.getJtfResultado().getText());   
    }

    //BUG 3
    @Test
    public void SequenciaErroBug3() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);  
        
        JTextField ent = tela.getJtfEntrada();        
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        //Exibe a tela por 2 segundos
        th.sleep(2000);

        //Adiciona uma sequencia
        ent.setText("900,20,40,50");

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
