package week1;

public class Palindrome_2 {

public static void main(String[] args) {
String str="abc";
StringBuilder sb=new StringBuilder(str);
String reverse=sb.reverse().toString();
if(str.equals(reverse))
{
	System.out.println("palindrome");
	
}
else
{
	System.out.println("not palindrome");
}
	}

}
