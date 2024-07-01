package AcessModifiers2;
import AcessModifiers1.A;

public class D {
	public static void main(String[] args) {
		A obj = new A();
		//System.out.println(obj.x);//default is not acessible outside the package
		//System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.w);


	}

}
