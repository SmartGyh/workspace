package mergeSort;

public class MergeSort {
	private int arr[] ;
	private int nElem;
	private int N;
	
	public MergeSort(int maxSize) {
		arr = new int[maxSize];
		nElem = 0;
	}
	
	public void display() {
		for (int i = 0; i <= N; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void insert(int a) {
		arr[nElem] = a;
		N = nElem++;
//		nElem++;
	}
	
	public void mergeSort() {
		int workspace[] = new int[nElem];
//		System.out.println("nElem:"+(nElem));
		recMerge(workspace, 0, --nElem);
	}
	//分解
	public void recMerge(int[] workspace,int start,int end) {
		if(start == end) {
			return ;
		}
		int mid = (start+end)/2;
		recMerge(workspace,start,mid);
		recMerge(workspace, mid+1, end);
		merge(workspace,start,mid+1,end);
	}
	
	//归并
	public void merge(int[] workspace,int lowerBound,int mid,int upperBound) {
		int j = 0;
		int p1 = lowerBound;
		int m = mid-1;
		int p2 = mid;
		while(p1 <= m && p2 <= upperBound) {
			if (arr[p1] < arr[p2]) {
				workspace[j++] = arr[p1++]; 
//				j++;
//				p1++;
			}else {
				workspace[j++] = arr[p2++];
//				j++;
//				p2++;
			}
		}
		while(p1 > m && p2 <= upperBound) {
//			System.out.println("lowerBound:"+lowerBound);
//			System.out.println("m:"+m);
//			System.out.println("upperBound:"+upperBound);
//			System.out.println("p1:"+p1);
//			System.out.println("p2:"+p2);
//			System.out.println("j:"+j);
			workspace[j++] = arr[p2++];
//			j++;
//			p2++;
		}
		while(p1 <= m && p2 > upperBound) {
//			System.out.println("lowerBound:"+lowerBound);
//			System.out.println("m:"+m);
//			System.out.println("upperBound:"+upperBound);
//			System.out.println("p1:"+p1);
//			System.out.println("p2:"+p2);
//			System.out.println("j:"+j);
			workspace[j++] = arr[p1++];
//			j++;
//			p1++;
//			System.out.println("-----------------------");
		}
		for(int n = 0;n < j;n++) {
			arr[lowerBound + n] = workspace[n];
		}
	}
	
}
