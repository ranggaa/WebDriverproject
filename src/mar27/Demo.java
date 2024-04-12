package mar27;

public class Demo {

	public static void main(String[] args) {
		//divide zero withany value
		try {
		int x=987,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
			//System.out.println(t.getMessage());
			//t.printStackTrace();
		}
		int a=4566,b=56,c;
		c=a/b;
		System.out.println(c);

	}

}
