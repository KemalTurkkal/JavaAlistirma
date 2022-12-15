import java.util.Scanner;

public class faktoriyelHesaplama {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n,r;
      int nToplam = 1;
      int rToplam = 1;
      int farkToplam = 1;
      System.out.print("kümenin elamanlarını giriniz : ");
      n = input.nextInt();
      System.out.print("Farklı grupların sayısını giriniz : ");
      r = input.nextInt();

      int fark = n - r;

      for (int i = 1; i <=n; i++){
        nToplam *= i;
      }
      for (int i = 1; i <=r; i++){
        rToplam *= i;
      }
      for (int i = 1; i <=fark; i++){
        farkToplam *= i;
      }
      int c = nToplam / (rToplam * farkToplam );
      input.close();

      System.out.print("C("+ n + "," + r + ") kombinasyonun cevabı : " + c );
    }
}
