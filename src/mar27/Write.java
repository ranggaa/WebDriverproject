package mar27;

import java.io.*;


public class Write {

	public static void main(String[] args) throws Throwable{
		// create new File
		File f =new File("D:/mrngbatch.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I want job in Top MNC");
		bw.newLine();
		bw.write("with 20L package");
		bw.newLine();
		bw.write("with attending classes and practise");
		bw.flush();
		bw.close();

	}

}
