package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Game;

public class CombatScreen {

	private JPanel panel = new JPanel();
	private JLabel title = new JLabel("COMBAT");
	private JButton combat = new JButton("Combat");
	private Game game;
	
	public CombatScreen(Game game) {
		this.game = game;
		this.inicializeScreen();
		
	}
	
	private void inicializeScreen() {
		this.game.getFrame().setTitle("Battle outside town");
		panel.add(title);
		panel.add(combat);
		
		combat.addActionListener(
			new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					
					CityScreen cityScreen = new CityScreen(game);
				}
			}
		);
		
		this.game.getFrame().getContentPane().removeAll(); 
		this.game.getFrame().setContentPane(panel);
		this.game.getFrame().getContentPane().revalidate();
		this.game.getFrame().getContentPane().repaint(); 
	}
}
