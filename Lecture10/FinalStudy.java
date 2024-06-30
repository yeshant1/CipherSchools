package keywords;
class A{
	final int noOfAlphabets = 26;//final variables: values once assigned cannot be changed
	 
	 final int noOfDigits;
	 //either assign the value at time of decleration or assign the value inside constructor
	 A()
	 {
		 noOfDigits = 10;
	 }
	 final void fun()
	{
		System.out.println("Hi I'm a function in class A");
	}
	
}

final class B extends A{//final class cannot be inherited
//	void fun()
//	{
//		System.out.println("I'm function in B overriding function in A");
//	}
}
//class C extends B{
//	
//}

public class FinalStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
