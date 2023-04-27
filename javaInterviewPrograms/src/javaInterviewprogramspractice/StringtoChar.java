package javaInterviewprogramspractice;

public class StringtoChar {

	public static void main(String[] args) {
		String name = "Prabha";
		char a[] = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			a[i] = name.charAt(i);
			for (char s : a) {
				System.out.println(a);
			}
		}

	}

}
