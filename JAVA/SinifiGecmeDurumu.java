import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fzk,turkce,kimya,muzik, toplam=0, derSayisi=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if ( 0<mat && mat<100 ){
            toplam+=mat;
            derSayisi++;
        }

        System.out.print("Lütfen fizik notunuzu giriniz : ");
        fzk = input.nextInt();
        if ( 0<fzk && fzk<100 ){
            toplam+=fzk;
            derSayisi++;
        }

        System.out.print("Lütfen turkce notunuzu giriniz : ");
        turkce = input.nextInt();
        if ( 0<turkce && turkce<100 ){
            toplam+=turkce;
            derSayisi++;
        }

        System.out.print("Lütfen kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if ( 0<kimya && kimya<100 ){
            toplam+=kimya;
            derSayisi++;
        }

        System.out.print("Lütfen muzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if ( 0<muzik && muzik<100 ){
            toplam+=muzik;
            derSayisi++;
        }

        
         double ort = toplam / derSayisi; 
        
         if (ort > 50) {
              System.out.print("Tebrikler ortalamanız " + ort + " sınıfı geçtiniz.");
        }
          else {
              System.out.print("Malesef " + ort + " ortalama ile sınıfı geçemediniz.");
        }
         

        input.close();
    }
}
