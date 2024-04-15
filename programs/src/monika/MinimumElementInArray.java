package monika;

public class MinimumElementInArray {
	public static int findMinimum(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
	int arr[] = {5,6,9,10,25,-9};
	System.out.println(findMinimum(arr));

	}

}
