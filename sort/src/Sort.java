
/**
 * 以下排序规定正序排列
 *
 */

public class Sort {
	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
//		Bubble_sort(arr);
		Select_sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	//冒泡排序
	public static void Bubble_sort(int arr[]){
		for(int i = arr.length-1;i > 0;i--){
			for (int j = 0; j < i; j++) {
				int temp = 0;
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
		
	//选择排序
	public static void Select_sort(int arr[]){
		int temp = 0;
		for(int i = 0;i < arr.length;i++){
			int n = i;
			for(int j = i;j < arr.length;j++){
				if(arr[j] < arr[n]){
					n = j;
//					System.out.println(arr[n]);
				}
			}
			temp = arr[n];
			arr[n] = arr[i];
			arr[i] = temp;
		}
		
		//插入排序
		
		
}







