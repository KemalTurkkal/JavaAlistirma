import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        double tutar,kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvOrani;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz : ");
        tutar = input.nextDouble();

        kdvOrani = tutar > 0 && tutar < 1000 ? kdvOrani1 : kdvOrani2;
       
        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;
        

        System.out.println("KDV'siz fiyat : " + tutar);
        System.out.println("KDV oranı : " + kdvOrani);
        System.out.println("KDV'li fiyat : " + kdvliFiyat);
        System.out.print("KDV tutarı : " + kdvTutari);


        input.close();
    }
}
