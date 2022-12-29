import java.util.Scanner;

public class RecursiveDeseneGore {

    static void int desen(int n, int b){
        if (n > 0){
            System.out.print(n);
            n -= 5;
            break;
        }else if (n <= 0){
            System.out.print(n);
            n += 5;
            break;
        }
        
    }

    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      
      System.out.print("N sayısı : ");
      int n = inp.nextInt();
      System.out.print("Çıktıısı : " + desen(n, n));

      inp.close();
    }
}
