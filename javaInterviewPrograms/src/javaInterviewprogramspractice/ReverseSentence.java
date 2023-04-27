package javaInterviewprogramspractice;

public class ReverseSentence {

	public static void main(String[] args) {
			String str="welcome to software testing";
			String temp = "";
			int start = 0, end = str.length() - 1;
			while (start < str.length()) {
				if (str.charAt(start) == ' ') {
					temp = temp + ' ';
					start++;
				} else {
					if (str.charAt(end) != ' ') {
						temp = temp + str.charAt(end);
						start++;
						end--;
					}
					else
						end--;
				}
			}
			System.out.println(temp);

		}

	}


