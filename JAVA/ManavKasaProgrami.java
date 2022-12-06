import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
      double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5,armutKg, elmaKg, domatesKg, muzKg, patlıcanKg;
      
      Scanner input = new Scanner(System.in);

      System.out.print("Armut kaç kilo : ");
      armutKg = input.nextDouble();
      System.out.print("Elma kaç kilo : ");
      elmaKg = input.nextDouble();
      System.out.print("Domates kaç kilo : ");
      domatesKg = input.nextDouble();
      System.out.print("Muz kaç kilo : ");
      muzKg = input.nextDouble();
      System.out.print("Patlıcan kaç kilo : ");
      patlıcanKg = input.nextDouble();

      double toplamTutar = (armutKg * Armut) +  (elmaKg * Elma) + (domatesKg * Domates) + (muzKg * Muz) + (patlıcanKg * Patlıcan);

      System.out.print("Toplam Tutar : " + toplamTutar + " TL");

      input.close();
    }
}
