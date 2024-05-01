import java.util.Iterator;

public class ArraySum {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int sum = ArraySum(a);
		int result = multiply(5,10);
		int result1 = multiply1(15,10);
		int num = 5;
		System.out.println("Array Sum = " + sum);
		System.out.println("Multiply  = " + result);
		System.out.println("Multiply  = " + result1);
		
		for (int i = 1; i <=10; i=i+1) {
			
			System.out.printf("%d * %d = %d\n" , num , i , num*i );
			
		}

	}
	

	public static int multiply1(int i, int j) {
		int sum=0;
		for (int k = 1; k <= j ; k++) {
			sum=sum+i;
			
		}
		return sum;
	}


	public static int multiply(int i, int j) {
		
		int sum=0;
		int k=1;
		while (k<=j)
		{
			sum=sum+i;
			k++;
		}
		
		
		return sum;
	}

	

	public static int ArraySum(int a[]) {
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2!=0)
			{
			sum=sum+a[i];
			}
			
		}
		return sum;
	}

	
}
