package GridData;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Grid extends JPanel {
	
	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawString("Java 2D", 50, 50);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}

}

public class BasicGrid extends JFrame {
	
	public BasicGrid() {
		initUI();
	}
	
	private void initUI() {
		add(new Grid());
		
		setTitle("Simple Java 2D Example");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				BasicGrid grid = new BasicGrid();
				grid.setVisible(true);
			}
		});
	
	}
	
}