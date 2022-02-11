package co.kishore.day9.queuesandfileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader1=new FileReader("K");
		
		int i;
		
		while ((i=reader1.read())!=-1)
		{
			System.out.print((char) i);
		}
		
		
		
		
		

}
	
}
