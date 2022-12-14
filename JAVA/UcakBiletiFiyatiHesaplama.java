import java.util.Scanner;


public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int yas, select;
        double mesafe;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesefayi km cinsinden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1- Tek yön, 2- Gidiş dönüş) : ");
        select = input.nextInt();

        if ( mesafe > 0 && yas > 0 && (select == 1 || select == 2)){

            double NormalTutar = mesafe * 0.10;
            System.out.println("Normal tutar : " + NormalTutar);
            

            if (yas < 12){
                double yasİndirimi = NormalTutar * 0.50;
                System.out.println("Yaş indirimi : " + yasİndirimi);
                double İndirimliTutar = NormalTutar - yasİndirimi;
                System.out.println("İndirimli tutar : " + İndirimliTutar);
                if(select == 2){
                    double yolculukTipiİndirimi = İndirimliTutar * 0.20; 
                    System.out.println("Gidiş dönüş bilet indirimi : " + yolculukTipiİndirimi);
                    double ToplamTutar = ((İndirimliTutar - yolculukTipiİndirimi)* select);
                    System.out.println("Toplam tutar : " + ToplamTutar);
                }
            }else if ( yas > 12 && yas <24){
                double indirim = NormalTutar * 0.10;
                System.out.println("Yaş indirimi : " + indirim);
                double İndirimliTutar = NormalTutar - indirim;
                System.out.println("İndirimli tutar : " + İndirimliTutar);
                if(select == 2){
                    double yolculukTipiİndirimi = İndirimliTutar * 0.20; 
                    System.out.println("Gidiş dönüş bilet indirimi : " + yolculukTipiİndirimi);
                    double ToplamTutar = ((İndirimliTutar - yolculukTipiİndirimi)* select);
                    System.out.println("Toplam tutar : " + ToplamTutar);
                }
            }else if (yas > 65){
                double indirimli = NormalTutar * 0.30;
                System.out.println("Yaş indirimi : " + indirimli);
                double İndirimliTutar = NormalTutar - indirimli;
                System.out.println("İndirimli tutar : " + İndirimliTutar);
                if(select == 2){
                    double yolculukTipiİndirimi = İndirimliTutar * 0.20; 
                    System.out.println("Gidiş dönüş bilet indirimi : " + yolculukTipiİndirimi);
                    double ToplamTutar = ((İndirimliTutar - yolculukTipiİndirimi)* select);
                    System.out.println("Toplam tutar : " + ToplamTutar);
                }
            }

            
            


        }else{
            System.out.println("Hatalı veri girdiniz !");
        }



        input.close();
    }
    
}
