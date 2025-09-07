import java.lang.*;

class Circle{
	double x,y;
	double r;
	
	double circumference(){
	return 2* 3.14159 *r;
}

	double area(){
	return (22/7)*r*r;
}

	Circle(double a, double b, double c){
	x=a;
	y=b;
	r=c;
}
}



public class circledemo3 {

	public static void main(String args[]){
	Circle c1 = new Circle(3.0,4.0,5.0);
	Circle c2 = new Circle(0.0,0.0,10.0);

	
	System.out.println("Circumference " + c1.circumference());
	System.out.println("Area " + c1.area());
	System.out.println("Circumference " + c2.circumference());
	System.out.println("Area " + c2.area());
}

}