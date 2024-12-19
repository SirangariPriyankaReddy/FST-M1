package activities;

public class Activity4 {
	
	public static void main(String[] args){
		Activity4 actObj = new Activity4();
		//Create the unsorted array
		int[] nums = {10, 9, 47, 210, 24, 5, 26};
		// Call the function to sort the array 
		actObj.insertionSort(nums);
		System.out.println("Sorted array: " + nums);
	}
	
	public void insertionSort(int[]nums) {
		//Set the size of the array
		int size = nums.length;
		
		//Loop through the array,
		//starting from the second value	
		for(int i=1; i<size;i++) {
			//Set the key value and first compare value
			int key = nums[i];
			int j = i-1;
			
			//Check if key is lesser
			//If it is swap it with the left value
			while(j>=0 && key < nums[j]) {
				nums[j+1] = nums[j];
				--j;
				
			}
			//Make the next value the key
			nums[j+1] = key;
		}
	
	}

	
}
