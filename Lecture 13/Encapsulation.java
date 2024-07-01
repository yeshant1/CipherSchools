package encapsulation;
class Demo{
	private int a = 5;
	private int b = 10;
	private int c = 15;
	private int d = 20;
	public int getA()
	{
		System.out.println("Value of A was read");
		return this.a;
	}
	public int getB() {
		System.out.println("Value of A was read");
		return this.b;
	}
	public void setA(int a)
	{
		if(a>100)
		{
			this.a = a;
			System.out.println("Value of A changed to: "+a);
		}
		else {
			System.out.println("Cannot Set value outside limits");
		}
	}
	public void setB(int b)
	{
		this.b = b;
	}
	  
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		//System.out.println(d.a);//not visible because a is private
		System.out.println(d.getA());
		d.setA(100);
		System.out.println(d.getA());
	}

}
