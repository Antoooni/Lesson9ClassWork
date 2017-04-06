package by.htp.lesson9.string;

public class Main {

	public static void main(String[] args) {
		String s = "First String";
		System.out.println("s:  " + s.hashCode());
		
		String s2 = "Second String";
		System.out.println("s2: " + s2.hashCode());
		
		
		
		String s3 = "First String";
		System.out.println("s3: " + s3.hashCode());
		//сравнить по разному
		System.out.println(s==s3);
		System.out.println(s3.equals(s));// сравниваются ссылки
		
		String s4= s3;
		System.out.println("s4: " + s4.hashCode());
		
		String s5 = new String("Second String");
		System.out.println("s5: " + s5.hashCode());
		
		System.out.println(s2==s5);
		System.out.println(s2.equals(s5));
		
		String s6= new String();
		System.out.println("s6: " + s6.hashCode());
		
		String s7="";
		System.out.println("s7: " + s7.hashCode());
		
		//принудительно переместим в пул intern
		String s8 = s5.intern();
		char[] data= new char[10];
		data[0]='a';
		data[1]='b';
		data[9]='c';
		
		String s9  =String.copyValueOf(data);
		System.out.println("s9: "+s9);
		System.out.println(s9.length());
	}

}
