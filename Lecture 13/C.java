package AcessModifiers2;
import AcessModifiers1.A;

public class C extends A {
	public static void main(String[] args) {
		A obj  = new A();
		C childobj  = new C();
		System.out.println(childobj.y);
		//System.out.println(obj.x);//default is not acessible outside the package
		//System.out.println(obj.y);
		System.out.println(childobj.y);
		System.out.println(obj.z);
		System.out.println(childobj.w);



	}

}
