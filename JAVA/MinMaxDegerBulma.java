import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
        int max = 0,min = 0;
      System.out.print("Kaç tane sayı gireceksiniz : ");
      int n = inp.nextInt();
      System.out.println("sayıları arka arkaya giriniz!");

      for(int i =1; i<=n; i++){
        System.out.println(i+ ". Sayıyı giriniz : ");
        int sayi = inp.nextInt();
        if (i==1){
            max=sayi;
            min=sayi;
        }else if(sayi>max){
            max = sayi;
        }else if(sayi<min){
            min = sayi;
        }
      }

      System.out.println("Max değer : " + max);
      System.out.print("Min değer : " + min);
      


      inp.close();  
    }
}
