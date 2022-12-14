import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int yil;

      System.out.print("Yıl giriniz : ");
      yil = input.nextInt();
      
      if (yil %100 == 0){
        if (yil %400 == 0){
            System.out.print(yil + " bir artık yıldır !");
        }else{
            System.out.println(yil + " bir artık yıl değildir !");
        }
      }else if(yil %4 == 0 ){
        System.out.print( yil + " bir artık yıldır !");
      }else{
        System.out.print( yil + " bir artık yıl değildir !");
      }



      input.close();
    }
}
