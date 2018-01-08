package kapitel_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZweiButtons {
	
	JFrame frame;
	JLabel label;
	
	public static void main (String[] args) {
		ZweiButtons gui = new ZweiButtons ();
		gui.los();
	}
	
	public void los() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Ändere Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Ändere Kreis");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("Ich bin ein Label");
		MeinZeichenPanel zeichenPanel = new MeinZeichenPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, zeichenPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(420,300);
		frame.setVisible(true);
	}
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Autsch!");
		}
	} // innere Klasse schließen
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	} // innere Klasse schließen
	
}

class MeinZeichenPanel extends JPanel {
    
      public void paintComponent(Graphics g) {
         
         g.fillRect(0,0,this.getWidth(), this.getHeight());

         // Zufallsfarben zum Ausfüllen erzeugen
         int rot = (int) (Math.random() * 255);
         int grün = (int) (Math.random() * 255);
         int blau = (int) (Math.random() * 255);

         Color randomColor = new Color(rot, grün, blau);
         g.setColor(randomColor);
         g.fillOval(70,70,100,100);
      }

}
      

       
      

       