import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
      String userName,password,cevap,newPassword;

      Scanner inp = new Scanner(System.in);
      
      System.out.print("Kullanıcı adınızı giriniz : ");
      userName = inp.nextLine();
      System.out.print("Şifreniz : ");
      password = inp.nextLine();

      if (userName.equals("patika") && password.equals("java123")) {
        System.out.println("Giriş Yaptınız !");
      }
      else  if (password.equals("java123")) {
        System.out.println("Kullanıcı adı yanlış !");
      }
      else if (userName.equals("patika")) {
        System.out.println("Şifreniz yanlış! Şifreyi sıfırlamak istiyor musunuz? ('evet' veya 'hayır'): ");
        cevap = inp.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz : ");
                newPassword = inp.nextLine();

                if ( newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }else{
                System.out.println("Şifreyi sıfırlamak istemediniz. İyi günler.");
            }
            
      }

      inp.close();
    }

}
