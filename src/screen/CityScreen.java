package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Game;
import java.awt.event.ActionEvent;

public class CityScreen {

	private JPanel panel = new JPanel();
	private JLabel title = new JLabel("CITY");
	private JButton combat = new JButton("Combat");
	private Game game;
	
	public CityScreen(Game game) {
		this.game = game;
		this.inicializeScreen();
		
		game.getFrame().getContentPane().removeAll(); 
		game.getFrame().setContentPane(panel);
		game.getFrame().getContentPane().revalidate();
		game.getFrame().getContentPane().repaint(); 
	}
	
	private void inicializeScreen() {
		this.game.getFrame().setTitle("First Floor - City");
		panel.add(title);
		panel.add(combat);
		
		combat.addActionListener(
			new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					
					CombatScreen combatScreen = new CombatScreen(game);
				}
			}
		);
	}
	
}
