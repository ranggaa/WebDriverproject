package mar30;
public class Demo {
	//global non static variables
int x,y,z;
public void add()
{
	x=8766;
	y=87;
	z=x+y;
	System.out.println(z);
}
public void division()
{
	x=877665;
	y=987;
	z=x/y;
	System.out.println(z);
}
	public static void main(String[] args) {
		//create reference object to call non static methods
		Demo a = new Demo();
		a.add();
		a.division();
		}
        }
