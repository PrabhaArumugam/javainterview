package javaInterviewprogramspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArraylist {

	public static void main(String[] args) {
		int count=0;
		ArrayList<String> arr= new ArrayList();
		arr.add("java");
		arr.add("c");
		arr.add("java");
		arr.add("java");
		
		Set dup=new HashSet();
		
		for(String s:arr) {
			if(dup.add(s)==false) {
				System.out.println("found duplicate"+s);
				count++;
			}
			
		}
		System.out.println("the count of duplicate elements is" +count);
		
		
		

	}

}
