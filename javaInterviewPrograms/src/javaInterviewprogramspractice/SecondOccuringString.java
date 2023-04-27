package javaInterviewprogramspractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

class getString{
	public void getMaxcount(String s) {
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr));
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String a:arr) {
			if(hm.containsKey(a)) {
				hm.replace(a,hm.get(a)+1);
			}
			else
			hm.put(a,1);
		}
		System.out.println(hm);
		Collection<Integer> count=hm.values();
		Object a[]=count.toArray();
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if((int)a[i]>(int)a[j]) {
					temp=(int) a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for(Entry<String,Integer> entry:hm.entrySet()) {
			if(entry.getValue()==a[1]) {
				System.out.println(entry.getKey()+"-->"+entry.getValue());
			}
		}
	}
}

public class SecondOccuringString {

	public static void main(String[] args) {

		getString gs= new getString();
		String s= "aa bb cc dd aa tt rr dd rr tt dd aa bb cc dd tt rr rr tt aa aa aa tt";
		gs.getMaxcount(s);
		
	}

}
