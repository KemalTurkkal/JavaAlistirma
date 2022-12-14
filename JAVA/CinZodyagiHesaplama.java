import java.util.Scanner;



public class CinZodyagiHesaplama {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int dogumyili;

      System.out.print("Doğum yılınızı giriniz : ");
      dogumyili = input.nextInt();

      double kalan = dogumyili %12;

      if(kalan == 0){
        System.out.print("Çin zodyağı burcunuz : Maymun ");
      }else if (kalan == 1){
        System.out.print("Çin zodyağı burcunuz : Horoz ");
      }else if (kalan == 2){
        System.out.print("Çin zodyağı burcunuz : Köpek ");
      }else if (kalan == 3){
        System.out.print("Çin zodyağı burcunuz : Domuz ");
      }else if (kalan == 4){
        System.out.print("Çin zodyağı burcunuz : Fare ");
      }else if (kalan == 5){
        System.out.print("Çin zodyağı burcunuz : Öküz ");
      }else if (kalan == 6){
        System.out.print("Çin zodyağı burcunuz : kaplan ");
      }else if (kalan == 7){
        System.out.print("Çin zodyağı burcunuz : tavşan ");
      }else if (kalan == 8){
        System.out.print("Çin zodyağı burcunuz : Ejderha ");
      }else if (kalan == 9){
        System.out.print("Çin zodyağı burcunuz : Yılan ");
      }else if (kalan == 10){
        System.out.print("Çin zodyağı burcunuz : At ");
      }else if (kalan == 11){
        System.out.print("Çin zodyağı burcunuz : Koyun ");
      }else{
         System.out.print("hatalı giriş yaptınız. ");
      }

      input.close();  
    }
}
