import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {
        int k,toplam = 0, sayi = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayıyı giriniz : ");
        k = input.nextInt();
        int i = 1; 
        while( i <= k){
            if ( i %3 == 0 && i %4 == 0){
                toplam = toplam + i;
                sayi++;
            }
            i++;
        }
        double ort = toplam / sayi;
        System.out.print("ortalama : " + ort);


        input.close();
    }
}
