import java.util.Scanner;



public class EBOBveEKOKbulma {
    public static void main(String[] args) {
     
      int n1, n2;
      int ekok = 0;
      int ebob = 1;
      int i = 1;

      Scanner inp = new Scanner(System.in);
      System.out.print("n1 sayısını giriniz:");
      n1 = inp.nextInt();

      System.out.print("n2 sayısını giriniz:");
      n2 = inp.nextInt();

      while (i <= n1 && i <= n2) {
          if (n1 % i == 0 && n2 % i == 0){
            
              ebob = i;
          }
          i++;


      }
  i++;
      System.out.println(ebob);
      ekok = n1 * n2 / ebob;
      System.out.println(ekok);


      inp.close();
    }
}
