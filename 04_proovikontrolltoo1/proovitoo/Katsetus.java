import java.util.Scanner;

public class Katsetus{
   public static void main(String[] args){
      int n, i, sum=0;
      float arkesk;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Mitu numbrit soovite sisestada? ");
      n = scan.nextInt();
      int[] arr = new int[n];
      
      System.out.print("Sisestage " +n+ " Numbrid: ");
      for(i=0; i<n; i++){
         arr[i] = scan.nextInt();
         sum = sum + arr[i];
      }
      
      arkesk = sum/n;
      System.out.println("\nAritmeetiline keskmine = " +arkesk);
   }
}