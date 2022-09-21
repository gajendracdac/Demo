import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		int size=kb.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" numbers : ");
		
		for (int i=0;i<size;i++)
		{
			arr[i]=kb.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for (int i=1;i<size;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Smallest Value in the array is "+min);
		System.out.println("Largest Value in the array is "+max);
		
	}

}