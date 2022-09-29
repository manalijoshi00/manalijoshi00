import java.util.Arrays;

public class SortingEx {
	
private static int[] sort(int[] array) {
		
		int LastNegativeIndex = -1;
		
		for(int i = 0; i < array.length; i++) {
			
			if (array[i] < 0) {
				
				LastNegativeIndex += 1;
				int temp = array[i];
				array[i] = array[LastNegativeIndex];
				array[LastNegativeIndex] = temp;
			}
		}
		return array;
}
	    public static void main(String[] args) {
	    	
	    	int array[]= {5, -11, 4, -8, 0, -7, 3, -9, -3, 9, -10, 1};

		    System.out.println("Before Sorting");
		    
		    for(int i : array) {
		    	
		    	System.out.println(i + " ");
		    }	
		    array = sort(array);
		    System.out.println("\n After Sorting");
		    
		    for(int i : array) {
		    	
		    	System.out.println(i + " ");
		    	
		    }
		    
	    }
	    
}

	    
	        
	    
	   
	    
	        

	    



