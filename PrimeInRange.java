import java.util.Scanner;

public class Main {
  
  static boolean isPrime(int num) {
    
    if(num <= 1) 
      return false;
    
    for(int i = 2; i <= num / 2; i++) 
      if(num % i == 0)
        return false;
    
    return true;
  }
  
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    int lowerNum, upperNum;
    
    System.out.println("Enter range of numbers: ");
    lowerNum = input.nextInt();
    upperNum = input.nextInt();
    
    for(int i = lowerNum; i <= upperNum; i++) {
      
      if(isPrime(i))
        System.out.print(i + " ");
    } 
  }
}
