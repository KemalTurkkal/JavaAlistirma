import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a,b;
      int sonuc = 1;
      System.out.print("Üstü alıncak Sayıyı giriniz : ");
      a = input.nextInt();
      System.out.print("Üs olucak sayıyı giriniz : ");
      b = input.nextInt();

      for(int i= 1; i <= b; i++ ){
        sonuc *= a;
      }

      System.out.print(sonuc);
      


      input.close();
    }
}
