
public class MaxSubSum {
	public static int maxSubSum(int[] array){
		//array length check
		if (array.length==0){
			System.out.println("Array with no elements. Assume the sum is 0.");
			return 0;
		}
		//store max sum
		int maxSum=array[0];
		//store current sum in each group
		int currentSum=0;
		for(int i=0; i<array.length; i++){
			// current sum is negative, discard it, or it will decrease sum of following elements
			if(currentSum<0)
				currentSum=array[i];
			// just add new element
			else
				currentSum+=array[i];
			// current>max, replace
			if(currentSum>maxSum)
				maxSum=currentSum;
		}
		return maxSum;
	}
	
	public static void main(String[] args){
		// normal test case
		int[] a ={-1,4,8,-3,3,5,5,-1,0};
		//int[] a={-1,3,4,-8,1,8,-1,4};
		// array with no elements
		//int[] a ={};
		// array with all negative integers
		//int[] a={-4,-2,-1,-7};
		// array with all positive integers
		//int[] a={4,2,1,7};
		// array with all zero
		//int[] a={0,0,0};
		System.out.println(maxSubSum(a));
	}
}
