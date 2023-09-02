package classes;
import javax.swing.JFrame;

public class Game {

	private JFrame frame;
	private int hp;
	private int enemyHp;
	
	public Game() {
		frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.setSize(900,600);
	    frame.setVisible(true);

		hp = 100;
		enemyHp = 100;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEnemyHp() {
		return enemyHp;
	}

	public void setEnemyHp(int enemyHp) {
		this.enemyHp = enemyHp;
	}
	
	
}
