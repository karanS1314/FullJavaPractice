package sortedAlgo;

public class ArraysAndString {

	public static void main(String[] args) {
		
		
		int a[]= {2,1,8,-3,6,4,12};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
		if(a[j+1]<a[j]) {
			swap(a[j],a[j+1]);
		}
				
				
			}
			
		}

	for(int i=0;i<n;i++) {
		
		System.out.print(a[i] + "  ");
	}
	}
}