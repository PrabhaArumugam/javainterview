package javaInterviewprogramspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysMergeandSort {

	public static void main(String[] args) {
		int a[]= {45,12,11,6,8,9};
		int b[]= {77,56,13,15,94,25,66};
		int c[]=new int[a.length+b.length];
		int count=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			count++;
		}
		System.out.println(Arrays.toString(c));
		for(int i=count,j=0;i<c.length;i++,j++) {
			c[i]=b[j];
		}
		System.out.println(Arrays.toString(c));
		
//		for(int i=0;i<c.length;i++) {
//			for(int j=0;j<c.length-1;j++) {
//				if(c[i]<=c[j]) {
//					temp=c[i];
//					c[i]=c[j];
//					c[j]=temp;
//				}
//			}
//		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}
