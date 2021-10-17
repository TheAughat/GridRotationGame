import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TilesGame implements ActionListener {
	
	JFrame frame;
	JButton but1, but2, but3, but4, but5, but6, but7, but8, but9;
	Tile but1t, but2t, but3t, but4t, but5t, but6t, but7t, but8t, but9t;
	JPanel panel;
	
	int degrees = 0;
	int[] degreeChoices = {90, 180, 270, 360};
	
	TilesGame(){
		
		frame = new JFrame();
		frame.setSize(820, 840);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tile Game");
		
		but1 = new JButton(); but1.addActionListener(this);
		but1t = new Tile("tileImages\\tiles_01.jpg");
		but2 = new JButton(); but2.addActionListener(this);
		but2t = new Tile("tileImages\\tiles_02.jpg");
		but3 = new JButton(); but3.addActionListener(this);
		but3t = new Tile("tileImages\\tiles_03.jpg");
		but4 = new JButton(); but4.addActionListener(this);
		but4t = new Tile("tileImages\\tiles_04.jpg");
		but5 = new JButton(); but5.addActionListener(this);
		but5t = new Tile("tileImages\\tiles_05.jpg");
		but6 = new JButton(); but6.addActionListener(this);
		but6t = new Tile("tileImages\\tiles_06.jpg");
		but7 = new JButton(); but7.addActionListener(this);
		but7t = new Tile("tileImages\\tiles_07.jpg");
		but8 = new JButton(); but8.addActionListener(this);
		but8t = new Tile("tileImages\\tiles_08.jpg");
		but9 = new JButton(); but9.addActionListener(this);
		but9t = new Tile("tileImages\\tiles_09.jpg");
		
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 800);
		panel.setLayout(new GridLayout(3, 3));
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		
		
		frame.add(panel);
		
		but1.setIcon(but1t.img);
		but2.setIcon(but2t.img);
		but3.setIcon(but3t.img);
		but4.setIcon(but4t.img);
		but5.setIcon(but5t.img);
		but6.setIcon(but6t.img);
		but7.setIcon(but7t.img);
		but8.setIcon(but8t.img);
		but9.setIcon(but9t.img);
		
		frame.setVisible(true);
		
		
		
		rotateImage(but1t.degreesChoices[but1t.degrees], but1, but1t);
		rotateImage(but2t.degreesChoices[but2t.degrees], but2, but2t);
		rotateImage(but3t.degreesChoices[but3t.degrees], but3, but3t);
		rotateImage(but4t.degreesChoices[but4t.degrees], but4, but4t);
		rotateImage(but5t.degreesChoices[but5t.degrees], but5, but5t);
		rotateImage(but6t.degreesChoices[but6t.degrees], but6, but6t);
		rotateImage(but7t.degreesChoices[but7t.degrees], but7, but7t);
		rotateImage(but8t.degreesChoices[but8t.degrees], but8, but8t);
		rotateImage(but9t.degreesChoices[but9t.degrees], but9, but9t);
	}
	
	public void rotateImage(double degrees, JButton butn, Tile butnt) {
		ImageIcon icon = new ImageIcon(getClass().getResource("tileImages\\tiles_01.jpg"));
		BufferedImage blankCanvas = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = (Graphics2D)blankCanvas.getGraphics();
		g2d.rotate(Math.toRadians(degrees), icon.getIconWidth()/2, icon.getIconHeight()/2);
		g2d.drawImage(butnt.img1, 0, 0, null);
		butn.setIcon(new ImageIcon(blankCanvas));
	}
	
	public static void main(String[] args) {
		new TilesGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (but1t.degrees == 0 &&
			but2t.degrees == 0 &&
			but3t.degrees == 0 &&
			but4t.degrees == 0 &&
			but5t.degrees == 0 &&
			but6t.degrees == 0 &&
			but7t.degrees == 0 &&
			but8t.degrees == 0 &&
			but9t.degrees == 0) {
			JOptionPane.showMessageDialog(frame, "You Win!");
		}
		else {
			if (e.getSource() == but1) {
				but1t.degrees++;
				if (but1t.degrees == 4) {
					but1t.degrees = 0;
				}
				rotateImage(but1t.degreesChoices[but1t.degrees], but1, but1t);
			}
			else if (e.getSource() == but2) {
				but2t.degrees++;
				if (but2t.degrees == 4) {
					but2t.degrees = 0;
				}
				rotateImage(but2t.degreesChoices[but2t.degrees], but2, but2t);
			}
			else if (e.getSource() == but3) {
				but3t.degrees++;
				if (but3t.degrees == 4) {
					but3t.degrees = 0;
				}
				rotateImage(but3t.degreesChoices[but3t.degrees], but3, but3t);
			}
			else if (e.getSource() == but4) {
				but4t.degrees++;
				if (but4t.degrees == 4) {
					but4t.degrees = 0;
				}
				rotateImage(but4t.degreesChoices[but4t.degrees], but4, but4t);
			}
			else if (e.getSource() == but5) {
				but5t.degrees++;
				if (but5t.degrees == 4) {
					but5t.degrees = 0;
				}
				rotateImage(but5t.degreesChoices[but5t.degrees], but5, but5t);
			}
			else if (e.getSource() == but6) {
				but6t.degrees++;
				if (but6t.degrees == 4) {
					but6t.degrees = 0;
				}
				rotateImage(but6t.degreesChoices[but6t.degrees], but6, but6t);
			}
			else if (e.getSource() == but7) {
				but7t.degrees++;
				if (but7t.degrees == 4) {
					but7t.degrees = 0;
				}
				rotateImage(but7t.degreesChoices[but7t.degrees], but7, but7t);
			}
			else if (e.getSource() == but8) {
				but8t.degrees++;
				if (but8t.degrees == 4) {
					but8t.degrees = 0;
				}
				rotateImage(but8t.degreesChoices[but8t.degrees], but8, but8t);
			}
			else if (e.getSource() == but9) {
				but9t.degrees++;
				if (but9t.degrees == 4) {
					but9t.degrees = 0;
				}
				rotateImage(but9t.degreesChoices[but9t.degrees], but9, but9t);
			}
			
			if (but1t.degrees == 0 &&
				but2t.degrees == 0 &&
				but3t.degrees == 0 &&
				but4t.degrees == 0 &&
				but5t.degrees == 0 &&
				but6t.degrees == 0 &&
				but7t.degrees == 0 &&
				but8t.degrees == 0 &&
				but9t.degrees == 0) {
					JOptionPane.showMessageDialog(frame, "You Win!", "Game Over", 1);
				}
		}
		
	}
}







