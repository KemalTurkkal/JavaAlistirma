import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Lütfen üçgenin 1.kenarını giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen üçgenin 2.kenarını giriniz : ");
        b = input.nextInt();
      
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : " + c);

        
        input.close();
    }

}