import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        
        for(int k = 100; k<1000; k++){
            int tempNumber = k;
            int basNumber = 0;
            int basValue;
            int result = 0;
            int basPow;
            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }

            tempNumber = k;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                // 1*1*1*1 = 1^4
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }

            if (result == k) {
                System.out.println(k + " sayısı bir Armstrong sayıdır.");
            } 
        }    

        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */
        input.close();
    }
}