import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
		Scanner tarayici = new Scanner(System.in);
		System.out.print("Fibonacci serisinin eleman sayısını girin: ");
		int elemanSayisi = tarayici.nextInt();
	
		int onceki = 0, simdiki = 1;
		System.out.print("Fibonacci serisi: " + onceki + " " + simdiki);
	
		for (int i = 2; i < elemanSayisi; i++) {
		  int sonraki = onceki + simdiki;
		  System.out.print(" " + sonraki);
		  onceki = simdiki;
		  simdiki = sonraki;
		}

      tarayici.close(); 
    }
}
