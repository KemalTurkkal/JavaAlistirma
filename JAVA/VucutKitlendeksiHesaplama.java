import java.util.Scanner;

public class VucutKitlendeksiHesaplama {
    public static void main(String[] args) {
      double boy, kilo;
    
      Scanner input = new Scanner(System.in);

      System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
      boy = input.nextDouble();
      System.out.print("Lütfen kilonuzu giriniz : ");
      kilo = input.nextDouble();

      double VKE = kilo / (boy * boy);
      

      
      System.out.println("Vücut kitle indeksiniz : " + VKE);
      input.close();
    }
}
