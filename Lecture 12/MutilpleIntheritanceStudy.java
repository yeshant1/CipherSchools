package abstraction;
interface M{
	int x = 10;
	void fun();
}
interface N{
	int x = 20;
	void fun();
}
class C implements M,N//multiple inheritence in java
{
	public void fun() {
		System.out.println("Hello,I'm fun");
		System.out.println(M.x);
		System.out.println(N.x);//amviquity resolved using fully quilified name
		System.out.println(M.super.hashCode());
		System.out.println(N.super.hashCode());
	}
}
interface O extends M,N//Multiple inheritence through interface
{
	void fun();
	
}
class D implements O//multiple inheritence in java
{
	public void fun() {
		System.out.println("Hello,I'm function in D");
	}
}


public class MultipleinheritenceStudy {

	public static void main(String[] args) {
		
			C c = new C();
			c.fun();
			
			D d = new D();
			d.fun();
			
		}
	}

