
public class Searching {
	public static void main(String[] args) {
		int array[] =  new int[] {1,4,5,9,12,21,35,42,53,55,67,71,74,    78,82,85,91,99,100,102,104,134,186,292,300,302};
		System.out.println(binarySearchRecursive(array, 75));
		System.out.println(binarySearchIterative(array, 75));

	}
	
	//Public method which takes input array and value to find 
	public static boolean binarySearchRecursive(int[] array, int value) {
		return binarySearchRecursive(array, value, 0, array.length-1);
	}
	//Private helper method which also tracks the min and max endpoints of the array
	private static boolean binarySearchRecursive(int[] array, int value, int min, int max) {
		//Cannot happen if the number is in the array
		 if (min > max) {
			 return false;
		 }
		 
		 //Ser the mid point
		 int mid = (min + max) / 2;
		 
		 //Base case
		 if (array[mid] == value) {
			 return true;
		 }
		 //Recursively check the left side of the array, reduce area to check
		 else if (value < array[mid]) {
			 return binarySearchRecursive(array, value, min, mid - 1);
		 }
		 //Otherwise check the right side of the array
		 else {
			 return binarySearchRecursive(array, value, mid + 1, max);
		 }
	}
	

	// Iterative Binary Search method
	public static boolean binarySearchIterative(int[] array, int value) {
			int min = 0;
			int max = array.length - 1;
			
			while (min <= max) {
				//Ser the mid point
				 int mid = (min + max) / 2;
				 
				 //Base case
				 if (array[mid] == value) {
					 return true;
				 }
				 //Recursively check the left side of the array, reduce area to check
				 else if (value < array[mid]) {
					 max = mid - 1;
				 }
				 //Otherwise check the right side of the array
				 else {
					 min = mid + 1;
				 }
			}
			//At this point, the value does not exist
			return false;
	}
}
