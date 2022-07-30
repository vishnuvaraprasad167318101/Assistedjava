public class DemoString {

	public static void main(String[] args) {
		String s="agfhe";
		String s1="abcdef";
		System.out.println("the string length is"+s.length());
		System.out.println("the character at a location is"+s.charAt(2));
		System.out.println("location of a character"+s.indexOf('d'));
		System.out.println("location of character in reverse"+s.lastIndexOf('d'));
		System.out.println("convert lower to upper"+s.toUpperCase());
		System.out.println("substring model 1"+s.substring(2));
		System.out.println("substring model 2"+s.substring(2,5));
		System.out.println("equals"+s1.equals(s));
		System.out.println("=="+s1==(s));
		System.out.println("split example");
		String s2="abcd_edf_ijkl";
		String ss[]=s2.split("_");
		for(String l:ss) {
			System.out.println(l);
		}
System.out.println("string compare "+s1.compareTo(s));
		
		//concatenation
		System.out.println("concat model 1 "+ s.concat(s1));
		System.out.println("concat model 2 "+ s+s1);
		
		//conversions
		int a=1;
		String s3=a+"";
		String s4=String.valueOf(a);
		String s5=Integer.toString(a);
		
	

			
	

	}

}
