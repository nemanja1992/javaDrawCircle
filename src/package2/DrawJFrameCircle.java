package package2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawJFrameCircle extends JFrame{
	
	public DrawJFrameCircle() throws HeadlessException{
		setSize(500,530);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new DrawArea());
		setVisible(true);
	}
	public static void main(String[] args) {
		new DrawJFrameCircle();

	}

}

	class DrawArea extends JPanel{

		Point A=null;
		int nmbOfLoops=100;
		int length=100;
		public DrawArea(){
			A= new Point(250,250);
			
		}
		@Override
		protected void paintComponent (Graphics g) {
			g.fillRect(0, 0, 800, 800);
			g.setColor(Color.green);
			for(int i=0;i<400;i++) {
				g.drawLine(A.x + (int)(length * Math.cos(Math.PI * i/200.0) *(1-Math.cos(nmbOfLoops * Math.PI * i/200.0))),
						A.y + (int)(length * Math.sin(Math.PI * i/200.0) *(1-Math.cos(nmbOfLoops * Math.PI * i/200.0))),
						A.x + (int)(length * Math.cos(Math.PI * (i+1)/200.0) *(1-Math.cos(nmbOfLoops * Math.PI * (i+1)/200.0))),
						A.x + (int)(length * Math.sin(Math.PI * (i+1)/200.0) *(1-Math.cos(nmbOfLoops * Math.PI * (i+1)/200.0))));
				
			}
		}
	}
