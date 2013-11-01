
public class MaxSubSum {
	public static int maxSubSum(int[] array){
		if (array.length==0){
			System.out.println("Array with no elements. Assume the sum is 0.");
			return 0;
		}
		int maxSum=array[0];
		int currentSum=0;
		for(int i=0; i<array.length; i++){
			if(currentSum<0)
				currentSum=array[i];
			else
				currentSum+=array[i];
			if(currentSum>maxSum)
				maxSum=currentSum;
		}
		return maxSum;
	}
	
	public static void main(String[] args){
		//int[] a ={-1,4,8,-3,3,5,5,-1,0};
		//int[] a ={};
		//int[] a={-1,3,4,-8,1,8,-1,4};
		int[] a={-4,-2,-1,-7};
		System.out.println(maxSubSum(a));
	}
}
