import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String userName, password;
      int right  = 3;
      int select;
      int balance = 1500;

      while(right > 0){
        System.out.print("Kullanıcı adınız :");
        userName = input.nextLine();
        System.out.print("Parolanız :");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("dev122")){
            System.out.println("Merhaba, X Bankasına hoş geldiniz!");
            System.out.println("1-Para yatırma\n2-Para çekme\n3-Bakiye sorgula\n4-Çıkış yap");
            select = input.nextInt();

            switch (select){
                case 1:
                    System.out.print("Para miktarı :");
                    int price = input.nextInt();
                    balance += price;
                    System.out.println("Hesabınızda "+ balance +" bulunmaktadır.");
                    break;
                case 2:
                    System.out.print("Para miktarı :");
                     price = input.nextInt();
                    if(price > balance){
                        System.out.println("Bakiye yetersiz.");
                    }else{
                        balance -= price;
                    }
                    System.out.println("Hesabınızda "+ balance +" bulunmaktadır.");
                    break;
                case 3:
                    System.out.println("Bakiyeniz :" + balance);
                    break;
                case 4:
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.");
            }

        }else{
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyin.");
            if( right == 0 ){
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            }else{
                System.out.println("Kalan hakkınız : " + right);
            }
        }

      }

      


      input.close();  
    }
}
