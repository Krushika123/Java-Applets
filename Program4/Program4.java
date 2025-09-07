import java.applet.Applet;
import java.awt.Graphics;

public class Program4 extends Applet{

	public void init(){
	
	resize(300,300);

	}
	public void paint(Graphics g){
		g.drawString("Window resized to 300 300",150,150);
	}
}