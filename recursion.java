import java.util.Scanner;

public class recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter and indes for a Fibonnacci Number: ");
    int index = input.nextInt();

    System.out.println("The Fibonacci number at index " + index + " is " + recursionFunction(index));
    
   }
    
    public static int recursionFunction(int index) {
      if (index == 0)
        return 0;
      else if (index == 1)
        return 1;
      else
        return recursionFunction(index - 1) + recursionFunction(index - 2);
    }
  
}
    
