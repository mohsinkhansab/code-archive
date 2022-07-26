import java.util.Scanner;

public class Main {

	static boolean isPrime(int num) {
		
		int check = (int)Math.sqrt(num);
		
		if(num<=1)
			return false;
		else 
			for(int i=2;i<check;i++) 
				if(num%i == 0)
					return false;
		
		return true;
	}
	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num = input.nextInt();
		input.close();
		if(isPrime(num))
			System.out.println("prime");
		else 
			System.out.println("not a prime");	
	}
}
