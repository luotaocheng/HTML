package cn.ltc.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*; 
import javax.swing.JFrame;

public class MyGameFrame extends JFrame{
	
		public void paint(Graphics g)
		{
			g.setColor(Color.BLUE);
			g.drawOval(100,100,300,300);
		}
		public void lanchFrame(){
			this.setTitle("�ڱ�����Ա");
			this.setVisible(true);
			this.setSize(500,500);
			this.setLocation(400,400);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
					System.exit(0);
			}
			});
		}
		public static void main(String[] args) {
			MyGameFrame app = new MyGameFrame();
			app.lanchFrame();
			
		}
		
}
