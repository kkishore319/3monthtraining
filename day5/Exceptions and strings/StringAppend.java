package co.kishore.day5.Strings;

public class StringAppend {
	public static void main(String[] args) {
		
		String s1="Luk";
		String s2="ky";
		int a=(s1.length()-1);
		 
		if (s1.charAt(a)==s2.charAt(0))
		{
			System.out.println((s1.concat(s2.substring(1))).toLowerCase()); 
		}
		else {
			System.out.println(s1.concat(s2));
		}


	}
	
	

}
