package special.mathematical;

public class HighestPowOf2TillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=17;
		for(int i=n-1;i>-1;i--) 
		{
			if(((i)&(i-1))==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
