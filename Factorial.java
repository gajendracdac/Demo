import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
		int num,fact=1;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=kb.nextInt();
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial is "+fact);
	}

}
