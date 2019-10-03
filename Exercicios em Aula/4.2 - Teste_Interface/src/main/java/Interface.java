import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.AnalisadorSequencia;

public class Interface extends JFrame
{
	AnalisadorSequencia analisar = new AnalisadorSequencia();
	
	private static final long serialVersionUID = 1L;
	
	JButton jbAnalisa;
	JButton jbLimpar;
	
	private JMenuBar cjpbBarra;
	private JPanel jtPanel;
	
	private JLabel jlEntrada = new JLabel("Entrada:");
	private JLabel jlResultado = new JLabel("Resultado:");
	private JTextField jtfEntrada = new JTextField();
	private JTextField jtfResultado = new JTextField();		

	public Interface()
	{
		init();
	}		
	
	private void init()
	{		
		jtPanel = new JPanel();
		jtPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jtPanel);
		jtPanel.setLayout(null);		
		
		jbAnalisa = new JButton("Analisar String");
		jbLimpar = new JButton("Limpar Campos");		
		
		//Posicao na Tela
		jtPanel.setSize(480,480);
		jtPanel.setBounds(50, 50, 300, 300);		
		
		jbAnalisa.setBounds(100, 250, 250, 20);
		jbLimpar.setBounds(100, 280, 250, 20);		

		jlEntrada.setBounds(50, 100, 150, 30);
		jtfEntrada.setBounds(150,100, 300, 30);
		
		jlResultado.setBounds(50, 180, 150, 30);
		jtfResultado.setBounds(150,180, 300, 30);
			
		jtPanel.add(jbAnalisa);
		jtPanel.add(jbLimpar);
		jtPanel.add(jlEntrada);
		jtPanel.add(jlResultado);
		jtPanel.add(jtfEntrada);
		jtPanel.add(jtfResultado);	
		
		eventos();
    }
    	
	private void eventos()
	{
		jbAnalisa.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{               
				jtfResultado.setText("" + AnalisadorSequencia.analisar(jtfEntrada.getText()));
                
			}			
		});		

		jbLimpar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				jtfResultado.setText("");
				jtfEntrada.setText("");
			}
		});		
    }

    //GETTERS AND SETTERS
    public JButton getJbAnalisa() {
		return jbAnalisa;
	}


	public void setJbAnalisa(JButton jbAnalisa) {
		this.jbAnalisa = jbAnalisa;
	}


	public JButton getJbLimpar() {
		return jbLimpar;
	}


	public void setJbLimpar(JButton jbLimpar) {
		this.jbLimpar = jbLimpar;
	}


	public JMenuBar getCjpbBarra() {
		return cjpbBarra;
	}


	public void setCjpbBarra(JMenuBar cjpbBarra) {
		this.cjpbBarra = cjpbBarra;
	}


	public JPanel getJtPanel() {
		return jtPanel;
	}


	public void setJtPanel(JPanel jtPanel) {
		this.jtPanel = jtPanel;
	}


	public JLabel getJlEntrada() {
		return jlEntrada;
	}


	public void setJlEntrada(JLabel jlEntrada) {
		this.jlEntrada = jlEntrada;
	}


	public JLabel getJlResultado() {
		return jlResultado;
	}


	public void setJlResultado(JLabel jlResultado) {
		this.jlResultado = jlResultado;
	}


	public JTextField getJtfEntrada() {
		return jtfEntrada;
	}


	public void setJtfEntrada(JTextField jtfEntrada) {
		this.jtfEntrada = jtfEntrada;
	}


	public JTextField getJtfResultado() {
		return jtfResultado;
	}


	public void setJtfResultado(JTextField jtfResultado) {
		this.jtfResultado = jtfResultado;
	}
}