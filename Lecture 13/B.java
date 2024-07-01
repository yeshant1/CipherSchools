package AcessModifiers1;

public class B {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.x);//default is acessible int same package
		//System.out.println(obj.y);//private not acessible outside the class
		System.out.println(obj.z);
		System.out.println(obj.w);


	}

}
