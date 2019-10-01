import javax.swing.JOptionPane;

import model.AnalisadorSequencia;
 
public class AppInterface {

  public static void main(String[] args) 
  {		
		Tela tela = new Tela();
		tela.setSize(480,480);
		tela.setVisible(true);
		
		JOptionPane.showMessageDialog(tela, AnalisadorSequencia.analisar("11,12,13,14,15"));
	}
}