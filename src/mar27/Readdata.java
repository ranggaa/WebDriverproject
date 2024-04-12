package mar27;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readdata {

	public static void main(String[] args) throws Throwable{
		FileReader fr = new FileReader("D:/mrngbatch.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			Thread.sleep(1000);
			System.out.println(str);
		}
br.close();

	}

}
