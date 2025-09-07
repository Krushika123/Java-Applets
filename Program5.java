import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Program5 extends Applet{

	public void init(){
	
	setBackground(Color.BLUE);

	}
	public void paint(Graphics g){
		g.drawString("Window color blue",150,150);
	}
}