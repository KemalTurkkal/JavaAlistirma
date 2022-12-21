import java.util.Scanner;

public class MukemmelSayiyiBulanProgram {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);

      int a,toplam = 0;

      System.out.print("Bir sayı giriniz :");
      a = inp.nextInt();  

      for(int i=1; i<a; i++){
        if(a%i == 0){
            toplam += i;
        }
      }

      if(toplam == a ){
        System.out.print(a + " Mükemmel sayıdır.");
      }else{
        System.out.print(a + " Mükemmel sayı değildir.");
      }

      inp.close();
    }
}
