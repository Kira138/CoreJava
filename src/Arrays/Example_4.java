package Arrays;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello";
String s1="hello";
String res=s.toUpperCase();
String res2=s.toLowerCase();
System.out.println(res);
String res3=s.concat(s1);
System.out.println(res3);
String s3="    Hello    ";
String res4=s.trim();
System.out.println(res4);
String s4="HelloEveryone";
String res5=s.substring(5);
System.out.println(res5);
String s5="welcome to Bangalore";
String []a=s.split(" ");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
