package abstraction;
 abstract class Car//we cannot instantiate an abstract class ,which means we cannot create object of an abstract class
 {
	int maxSpeed; 
	abstract void accelerate();//Only declared but not implemented it is without a body
	//they are created to force the child classes to implemented there before using.we will use them after overriding
}
 class BMW extends Car{
	 void accelerate() {
		 System.out.println("BMW is accelerating ");
	 }
 }
 class BMW2 extends BMW{
	 void brake() {
		 System.out.println("BMW is applying breaks");
		 
	 }
	 
 }
 abstract class A{//An abstract class can exist without abstract methods
	 //We simply mean we will not be able to create object(instantiate) of this class.
	 int x = 10;
	 void fun()
	 {
		 System.out.println("Hello,I'm A");
	 }
 }

public class AbstractStudy {

	public static void main(String[] args) {
		//Car c = new Car(); //Cannot instantiate an abstract class
		BMW beemer = new BMW();
		beemer.accelerate();
		//System.out.println();
		BMW2 b = new BMW2();
		b.accelerate();
		b.brake();
	}

}
 
