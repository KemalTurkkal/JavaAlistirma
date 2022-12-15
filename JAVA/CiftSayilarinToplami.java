import java.util.Scanner;


public class CiftSayilarinToplami {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n;
      int toplam = 0;

      do {
            System.out.print("Sayı giriniz : ");
            n = input.nextInt();
            if ( n % 2 == 0 && n %4 == 0){
                toplam += n;
            }
      } while (n %2 == 0);
      
      
      System.out.print("Toplam : " + toplam);


      input.close();
    }
}
