import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
      int month, day;
      String burc = "";
      boolean isError = false;

      Scanner input = new Scanner(System.in);
      System.out.print("Doğduğunuz ay : ");
      month = input.nextInt();

      System.out.print("Doğduğunuz gün : ");
      day = input.nextInt();


      if (month >= 1 && month <= 12) {
        if ((month == 1) && (day >= 1) && (day <= 31)) {
           if (day < 22) {
                burc = "Oğlak";
           }else{
                burc = "Kova";
           }
        }else{
            isError = true;
        }
        
        if ((month == 2) && (day >= 1) && (day <= 28) ){
            if (day < 20) {
                burc = "kova";
            }else {
                burc = "balık";
            }
        }else{
            isError = true;
        }

        if ((month == 3) && (day >= 1) && (day <= 31)){
            if (day < 21){
                burc = "balık";
            }else{
                burc = "koç";
            }
        }else{
            isError = true;
        }

        if ((month == 4) && (day >= 1) && (day <=30 )){
            if (day < 21){
                burc = "koç";
            }else{
                burc = "boğa";
            }
        }else{
            isError = true;
        }

        if ((month == 5) && (day >= 1) && (day <= 29)){
            if (day < 22){
                burc = "boğa";
            }else{
                burc = "ikizler";
            }
        }else{
            isError = true;
        }

        if ((month == 6) && (day >= 1) && (day <= 30)){
            if(day < 23){
                burc = "ikizler";
            }else{
                burc = "yengec";
            }
        }else{
            isError = true;
        }

        if ((month == 7) && (day >= 1) && (day <= 31)){
            if(day < 23){
                burc = "yengec";
            }else{
                burc = "aslan";
            }
        }else{
            isError = true;
        }

        if ((month == 8) && (day >= 1) && (day <= 31)){
            if(day < 23){
                burc = "aslan";
            }else{
                burc = "başak";
            }
        }else{
            isError = true;
        }

        if((month == 9) && (day >= 1) && (day <= 30)){
            if (day < 23){
                burc = "başak";
            }else{
                burc = "terazi";
            }
        }else{
            isError = true;
        }

        if((month == 10) && (day >= 1) && (day <= 30)){
            if (day < 23){
                burc = "terazi";
            }else{
                burc = "akrep";
            }
        }else{
            isError = true;
        }

        if((month == 11) && (day >= 1) && (day <= 30)){
            if (day < 22){
                burc = "akrep";
            }else{
                burc = "yay";
            }
        }else{
            isError = true;
        }

        if((month == 12) && (day >= 1) && (day <= 31)){
            if (day < 22){
                burc = "yay";
            }else{
                burc = "oğlak";
            }
        }else{
            isError = true;
        }

        System.out.print("Burcunuz : " + burc);

      }else{
        System.out.println("Ay için geçersiz değer. Lütfen tekrar deneyiniz." + isError);
      }


      input.close();
    }
}
