

public class AsalSayiBulma {
    public static void main(String[] args) {
    
      
      for(int i = 2; i <= 100; i++){
        boolean assal = true;
        for(int k = 2; k <i; k++ ){
            if(i%k == 0){
                assal = false;
            }
        }
        if (assal){
            System.out.print(i + ", ");
          }
     
      }
      
      


     
    }
}
