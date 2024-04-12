package mar30;
public class Ranga {
public static void addition(int a, int b)
{
	int c=a+b;
	System.out.println(c);
}
public static String verify_String(String str1,String str2)
{
	String res;
	if(str1.equalsIgnoreCase(str2))
	{
		res="Both Strings are Equal";
	}
	else
	{
		res="Both Strings are Not Equal";
	}
	return res;
}
public static boolean compare_Values(int x,int y)
{
	if(x==y)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Ranga.addition(1234, 3456);
	String a=	Ranga.verify_String("hello", "hello");
	System.out.println(a);
	boolean x=	Ranga.compare_Values(100, 300);
	System.out.println(x);	

	}

}
