import java.util.Scanner;

class NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = sc.nextInt();

		int square = num * num;
		int sum = 0;

		while(square > 0)
		{
			int rem = square % 10;
			sum = sum + rem;
			square /= 10;
		}

		if(num == sum)
		{
			System.out.println("It's Neon Number");
		}
		else
		{
			System.out.println("It's not a Neon Number");
		}
	}
}
