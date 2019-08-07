package examples;

public class ArrayDesanding {
	
	public static void main(String[] args) {
		
		int [] ray= {6,7,12,98,15,2,3,7,1,3}; 
		int n=10;
	for(int i=1; i<=n;i++)
	{
		for(int j=0;j<(n-1);j++)
		{
			if(ray[j+1]>ray[j])
			{
					int temp1=ray[j];
				int temp2=ray[j+1];
				ray[j]=temp2;
				ray[j+1]=temp1;
			}
		}
	}
	for(int x:ray) {
	System.out.println(x);
	}
	
	}

	
	


}
