package examples;

public class ArraySort {
	
public static void main(String[] args) { 
	int a[][]= new int [2] [2];  

	a[0][0]=4;
	a[0][1]=78;
	a[1][0]=34;
	a[1][1]=9;
	
	for (int i=0;i<2;i++)
	{
		for (int j=0;j<2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();

	}
	
	int b[]= {1,5,6,8,3};
	int avg = 0;
	int sum = 0;
	
	for(int i =0; i<b.length; i++) {
		
		sum=sum+b[i];
		
		}
	
	
	
	avg=sum/5;
	
	System.out.println();
	System.out.println("Average of elements  = " + avg);
	System.out.println();

	for(int i=0; i<b.length;i++) { 
		
		if(avg < b[i]) {
			
			System.out.println(" print that element bigger than average  = " +b[i]);
		}
		
		
	}
	
	

}


}
