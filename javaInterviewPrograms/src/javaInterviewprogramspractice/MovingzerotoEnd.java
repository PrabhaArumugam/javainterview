package javaInterviewprogramspractice;

public class MovingzerotoEnd {

	public static void main(String[] args) {
		int arr[]= {1,6,0,0,5,4,0,3};
		int len=arr.length;
		int count=0;
		
		
		for(int i=0;i<len;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
			
		}
		while(count<len) {
			arr[count++]=0;
		}
		for(int j=0;j<len;j++) {
			System.out.print(arr[j] +"," );
		}
	}

}
