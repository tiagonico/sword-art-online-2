package classes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import screen.CityScreen;

public class Main {

	public static void main(String[] args) {


		Game game = new Game();
//	    Painel meuPainel = new Painel();
//	    JPanel jpanel = new JPanel();
//	    
//	    JLabel label = new JLabel();
//	    label.setText("aaaaaa");
//	    
//	    JButton b = new JButton("push me");
//	    
//	    ActionListener al = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				janela.getContentPane().removeAll(); 
//				janela.setContentPane(meuPainel);
//				janela.getContentPane().revalidate();
//				janela.getContentPane().repaint(); 
//				
//			}
//	    };
//	    b.addActionListener(al);
//	    
//	    jpanel.add(label);
//	    jpanel.add(b);
	    
		CityScreen cityScreen = new CityScreen(game);
	}

}
