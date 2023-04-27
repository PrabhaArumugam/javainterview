package javaInterviewprogramspractice;

public class UpperandLower {
	public static void convertupper(StringBuffer str) {
		int len=str.length();
		char upper=0;
		for(int i=1;i<4;i++) {
			Character c=str.charAt(i);
			//upper=(char) (upper+c.toUpperCase(c));
			
			str.setCharAt(i, c.toUpperCase(c));
			//System.out.println(str);
		}
		
		
		System.out.println(str);
	}

	public static void main(String[] args) {
		//UpperandLower up=new UpperandLower();
		StringBuffer str=new StringBuffer("prabha");
		convertupper(str);

	}

}
