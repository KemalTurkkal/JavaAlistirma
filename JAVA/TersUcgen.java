import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Basamak sayısını giriniz :");
      int n = inp.nextInt();

      for(int i = n-1; i >= 1; i--){
        for(int t = 1; t <= n - i; t++){
            System.out.print(" ");
        }
        for(int k = 1; k <= 2*i - 1; k++){
            System.out.print("*");
        }
        System.out.println();

      }

      inp.close();  
    }
}
