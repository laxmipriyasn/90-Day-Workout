package week1;

public class Occurance_2 {

	public static void main(String[] args) {
	String str="hello oreo";
	int count=0;
	char[] charArray = str.toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
		if(charArray[i]=='o') {
			count++;
	}

	}
	System.out.println("Number of O's in the string: " +count);
}

}