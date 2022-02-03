package co.kishore.day5.Strings;

public class StringOperations {
	public static void main(String ar[]) {

		String s1 = "Sai kUmar";
		String s2="kUmar";
		String s3=new String("kumar");
		String s4="	\\s,\\s.\\s*";
		String s5="	Sai		";
		//[B@15db9742

		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains(s2));
		System.out.println(s1.charAt(0));
		//int a=s1.compareTo(s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.concat(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//System.out.println(s1.format(s2, ar));
		System.out.println(s1.getBytes());
		//System.out.println(s1);
		System.out.println(s1.indexOf(s2));
		System.out.println(s2==s3.intern());
		System.out.println(s4.isEmpty());
		System.out.println(s1.join("~",s1,s2,s3));
		System.out.println("..............");
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.length());
		System.out.println(s1.replace(s2, s4));
		//System.out.println(s2.split(s4)); we have use [] and for loop 
		System.out.println(s1.startsWith(s5));
		System.out.println(s1.substring(4));
		
		char[] val= s2.toCharArray();
		System.out.println(val);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s5.trim());
		System.out.println(s1.valueOf(val));
		

	}

}

