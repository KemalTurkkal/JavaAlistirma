import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b){
        if ( b == 0){
            System.out.println("İkinci sayı 0'dan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a*b));
    }



    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int select;  

      String menu = "1- Toplama işlemi\n"
                + "2- çıkarma işlemi\n"  
                + "3- Çarpma işlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama işlemi\n"
                + "6- Mod alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış yap\n";

        System.out.println(menu);        
        while(true){
            
            System.out.print("Bir işlem seçiniz : ");
            select = inp.nextInt();

            if (select == 0) {
 
               break;
            }

            System.out.print("İlk sayı : ");
            int a = inp.nextInt();
            System.out.print("ikinci Sayı : ");
            int b = inp.nextInt();
            
            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3: 
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod işlemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.print("Geçersiz bir işlem girdiniz.");

            }
        }

        System.out.println("Güle güle");
        



      inp.close();
    }
}
