import java.util.Scanner;
public class RecursiveAsalSayi {

    static boolean isPrime(int sayi, int i){
        if (i == sayi)
            return true;
        else if (sayi % i == 0)
            return false;

        return isPrime(sayi, i + 1);
    }       
        


    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
        int sayi;

        do{
            System.out.print("Sayı giriniz : ");
            sayi = inp.nextInt();
        }while(sayi <= 0);
            if(isPrime(sayi, 2))
                System.out.println(sayi + " Sayısı asal sayıdır.");
            else
                System.out.println(sayi + " Sayısı asal sayı değildir.");
        


      inp.close();
    }
}
