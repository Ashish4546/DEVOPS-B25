package calcpkg;

public class MyCalc {
	
	public int sum (int a, int b) 
	{
		int c;
		c=10+5;
		return c;
	}
	
	public int diff (int a, int b)
	{
		return a-b;
	}
	
	public int mul (int a, int b)
	{
		return a*b;
	}
	
	public int div (int a, int b)
	{
		return a/b;
	}
	
	public void greeting()
	{
		System.out.println("Hello GFG");
		System.out.println("Hello Good Morning");
	}
	
	public static void main(String[] args) {
		MyCalc ob = new MyCalc() ;
		System.out.println("Sum is: "+ob.sum(20, 10)) ;
		System.out.println("Diff is: "+ob.diff(20, 10));
		System.out.println("Mul is: "+ob.mul(20, 10));
		System.out.println("Div is: "+ob.div(20, 10));
		ob.greeting();
	}

}
