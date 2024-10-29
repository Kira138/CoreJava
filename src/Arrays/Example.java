package Arrays;
//without using built in methods used to convert character to string

public class Example {
public static void main(String[]args) {
	char[]ch= {'a','e','i','o','u'};
	String s="";

	for(int i=0;i<ch.length;i++)
	{
		
	s=s+ch[i];
}
	System.out.println(s);
}
}
