package co.kishore.day9.queuesandfileReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputdemo {
	public static void main(String[] args) throws Exception {
		
		String data=" Hai raa mowa";
		
		FileOutputStream output=new FileOutputStream("K");
		
		byte[] array= data.getBytes();
		
		output.write(array);
		output.close();
		
	}

}
