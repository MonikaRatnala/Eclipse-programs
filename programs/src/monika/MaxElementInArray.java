package monika;

public class MaxElementInArray {

	public static void main(String[] args) {
		int arr[] = {10,4,6,8,5,2,9};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
		}
System.out.println("The maximum elememt of array : "+max);
	}

}
