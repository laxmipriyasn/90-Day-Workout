package week1;

public class Occurance_3 {

	public static void main(String[] args) {
		String str="hello oreo";
		int  count=0;
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='o') {
					count++;
				}
			}
		}
		System.out.println("occurance of o: " +count);

	}

}
