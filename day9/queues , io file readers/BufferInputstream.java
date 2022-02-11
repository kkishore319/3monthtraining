package co.kishore.day9.queuesandfileReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferInputstream {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream Fin= new FileInputStream("abc.txt");
		BufferedInputStream readin=new BufferedInputStream(Fin);
		FileOutputStream output= new FileOutputStream("K");
		int i;
		
		while((i=readin.read())!=-1)
		{
			output.write(i);
		}
		
		Fin.close();
		readin.close();
		output.close();
		
	}

}
