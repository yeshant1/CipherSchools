package abstraction;
interface Shape{
	double p1 = 3.14;//public, Static, final
	double getSquare(double r);//public and abstract
}
class Circle implements Shape{
	
	public double getSquare(double r){
		return r*r;
	}
	void fun()
	{
		System.out.println("Hey, I implementd an interface named Shape");
	}
}
public class InterfaceStudy { 

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.getSquare(5));
		c.fun();
	}

}
