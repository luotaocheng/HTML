package gameball;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class Gameball extends JFrame{
	Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image ball1 = Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image ball2 = Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
	Random random = new Random();
	
	
	int x = random.nextInt(500);
	int y = random.nextInt(500);
	int z = random.nextInt(500);
	boolean right = true;
	boolean bottom = true;
	
	
	//速度变慢
	/*int i =10;
	for(int m=0;m<10;m++)
	{
		
		i--;
	}*/
	
	
	//画窗口的方法
	public void paint(Graphics g) {
		
		System.out.println("被画了yi遍");
		
	
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y,null);
		g.drawImage(ball1,(int)x,(int)z,null);
		g.drawImage(ball2,(int)z,(int)y,null);
		if(right) {
		x = x+10;
		}
		else {x = x-10;}
		if(x>856-40-30) {right =false;}
		if(x<40) {right = true;}
	
		if(bottom) {
			y = y+10;
			}
			else {y = y-10;}
			if(y>500-40-30) {bottom =false;}
			if(y<40+30) {bottom = true;}
			
		}
	
	
	
		
	
	
	//窗口加载
	void launchJFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
	
	//重画窗口
	while(true) {
		repaint();
		try {
			Thread.sleep(60);
		}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Gameball game = new Gameball();
		game.launchJFrame();
	}

}
