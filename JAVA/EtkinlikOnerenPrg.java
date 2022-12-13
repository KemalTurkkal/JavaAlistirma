import java.util.Scanner;

public class EtkinlikOnerenPrg {
    public static void main(String[] args) {
      int heat;

      Scanner input = new Scanner(System.in);
      System.out.print("Sıcaklık giriniz : ");
      heat = input.nextInt();

      if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
      } else if ( heat <= 25){
            if(heat <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsin.");
            }
      } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
      }


      input.close();

    }
}
