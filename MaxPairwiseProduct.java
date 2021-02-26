import java.util.*;
import java.util.Arrays;

public class MaxPairwiseProduct {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   int n = Integer.parseInt(scanner.nextLine());
  
   if (n < 2) {
    System.out.println("No pairs exists");
    return;
   }

   String[] str = scanner.nextLine().split(" ");

   if (str.length != n) {
    System.out.println("You have to write " + n + " numbers");
    return;
   }
   
   int[] arr = new int[str.length];

   for (int i = 0; i < str.length; i++) {
     arr[i] = Integer.parseInt(str[i]);
   }

   maxPairwise(n, arr);
  }


 static void maxPairwise(int n, int[] numbers) {
  int posa = Integer.MIN_VALUE,
      posb = Integer.MIN_VALUE;
      
  int nega = Integer.MIN_VALUE, 
      negb = Integer.MIN_VALUE;
	
  for(int i = 0; i < numbers.length; i++) {
   if(numbers[i] > posa) {
    posb = posa;
    posa = numbers[i];
   } else if(numbers[i] > posb) {
    posb = numbers[i];
   }
  }

  System.out.println((long)posa * posb);
 }
}
