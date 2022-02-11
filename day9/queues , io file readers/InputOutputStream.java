package co.kishore.day9.queuesandfileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputOutputStream {
	public static void main(String[] args) throws Exception {
		
		FileInputStream in=new FileInputStream("abc.txt");
		FileOutputStream out=new FileOutputStream("K");
		
		
		int i;
		
		while((i=in.read())!=-1)
		{
			out.write(i);
		}
		in.close();
		out.close();
	}

}
