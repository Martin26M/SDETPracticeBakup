package SDET2.SDETPractice;

public class sortzeroandone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] arr = {0,1,1,0,1,0,1};
		
	    int start =0;
	    int end = arr.length-1;
	    int temp=0;
	    
	    while (start<end) {
	    	
	    	if (arr[start]==0) {
	    		
	    		start++;
	    		
	    	}
	    	
	    	if (arr[end]==1) {
	    		
	    		end--;
	    		
	    	}
	    	
	    	temp = arr[start];
	    	arr[start]= arr[end];
	    	arr[end]= temp;
	    	
	    	start++;
	    	end--;
	    }
	    
	    for (Object res: arr) {
	    	
	    	System.out.println(res);
	    	
	    }
	}

}
