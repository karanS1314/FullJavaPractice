package geeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

 class Intervals{
	 int start;
	 int end;
	 Intervals(){
		 start=0;
		  end=0;
		
	 }
	 Intervals(int s,int e){
		 start=s;
		 end=e;
				
	 }
	
}

public class OverlappingIntervals {
	
	public static ArrayList<Intervals> ans(ArrayList<Intervals> intervals,int n){
//		if(intervals.size()==0) {
//			return intervals;
//		}
		
		if(intervals.size()==1) {
			return intervals;
		}else {
		for(int i=0;i<intervals.size()-1;i++) {
	
		Intervals current=intervals.get(i);
		Intervals next=intervals.get(i+1);
		
		
			if(current.end<next.start) {
				continue;
			}
			else if(current.start<next.start && current.end>next.end) {
				intervals.remove(i+1);
				i--;
			
			}
			else if (current.end>next.start) {
				next.start=Math.min(current.start, next.start);
				next.end=Math.max(next.end, current.end);
				intervals.remove(i);
				i--;
			}
		}
		}
		return intervals;
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			ArrayList<Intervals> intervals= new ArrayList<>();
			
			for(int i=0;i<n;i++) {
			
			Intervals obj=new Intervals();
			obj.start=sc.nextInt();
			obj.end=sc.nextInt();
			
			intervals.add(obj);
			}
			

		for(int i=0;i<ans(intervals, n).size();i++) {
				System.out.print(ans(intervals, n).get(i).start+ " "+ans(intervals, n).get(i).end+" " );
			}
//		System.out.print(ans(intervals, n).get(ans(intervals, n).size()-1).start+ " "+ ans(intervals, n).get(ans(intervals, n).size()-1).end);
			System.out.println();
			t--;
		}
		

	}

}
