import java.lang.*;

class Points{
int x,y;

int setPoints(int a, int b)
{

x=a;
y=b;

}
}


class Pointdemo{
public static void main(String args[]){

	Points p= new Points();
	p.setPoints(15,20);
	System.out.println("x = " +p.x);
	System.out.println("y = " +p.y);
}
}