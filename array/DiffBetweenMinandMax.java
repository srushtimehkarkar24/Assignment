package array;

public class DiffBetweenMinandMax {

	public static void main(String[] args) {
		int arr[] = {11,22,13,14,15};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max <= arr[i]) {
				max=arr[i];
			}
			
			if(min >= arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Difference of two elements : "+(max-min));

	}

}
