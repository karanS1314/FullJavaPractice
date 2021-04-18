package revision;

public class SelectionSort {
	public static void main(String[] args) {
		
		int a[]={5,6,-1,7,8};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
	            for(int j=i+1;j<n;j++) {
				  if(a[j]<a[min]) {
					min=j;
				  }
				   }
		       if(min!=i) {
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			
		       }
			
		}
		for(int sorted:a) {
			System.out.print(sorted+ " ");
		}
		
		
		
	

	}}
