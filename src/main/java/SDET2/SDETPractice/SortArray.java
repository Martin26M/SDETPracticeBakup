package SDET2.SDETPractice;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,3,8,7,6};
		
		int start = 0;
		int end= arr.length-1;
		int temp=0;
		
	while (start<end) {
		
		if (arr[start]<arr[end]) {
			
			temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			
		}
		
		start++;
		end--;
		
	}
	
	
	for (Integer res: arr) {
		
		System.out.println(res);
	}
	}

}
