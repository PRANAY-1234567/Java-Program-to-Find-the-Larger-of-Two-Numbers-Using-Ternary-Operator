class Ternary2
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a,b;
		System.out.print("Enter first number :");
		a = sc.nextInt();
		System.out.print("Enter second number :");
		b = sc.nextInt();

		System.out.println("Larger number is :"+(a>b?a:b));
	}
}