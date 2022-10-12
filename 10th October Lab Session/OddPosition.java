/* we need to print the elements of the array which are present in odd positions. This can
be accomplished by looping through the array and printing the elements of an array by
incrementing i by 2 till the end of the array is reached.*/

class OddPosition {

	public static void main(String[] args) {
		 int [] arr = new int [] {5, 1, 4, 7, 8, 9, 11};   
         
	        System.out.println("elements at odd positions of the array are :");    
	        for (int i = 0; i < arr.length; i = i+2) {   
	            System.out.println(arr[i]);   
	        }    
	}
}
