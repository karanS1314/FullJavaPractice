package geeksForGeeks;

public class RevrseArrInGroups {
	
	static void getReverse(int i,int n,int a[],int k) {
		int l=i;
		int r=Math.min(n-1,i+k-1 );
		while(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		
	}
   
	public static void main(String[] args) {
		
	   int a[]= {1,3,4,5,6,7,2};
	   int n=a.length;
	   int k=2;
	
		
     for(int i=0;i<n-1;i+=k) {
    	getReverse(i,n,a,k);
     }
     for(int e:a) {
    	 System.out.print(e+ " ");
     }
	}

}
