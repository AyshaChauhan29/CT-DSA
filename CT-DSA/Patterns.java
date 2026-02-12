import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

       //--------------->BINARY PATTERN<---------------------------
        //     for( int i=1; i <= n; i++){ //rows
        //     for(int j = 1; j <= i; j++){ //cols
        //         if(i % 2 == 0){     // i is even idhr
        //           if(j%2 == 0){     // then j ko check krenge ------->  
        //             System.out.print(1);
        //           }else{
        //             System.out.print(0);
        //           }
        //         } else{        // nhi to i odd h to
        //           if(j%2 == 0){    // j is even
        //             System.out.print(0);
        //           }else{
        //             System.out.print(1);
        //           }
        //         }
      
        //     }
        //     System.out.println();
        // }


        // Half BUTTERFLY PATTERN
        //   for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //     }
            
        //     for(int j=1; j<=2*(n-i); j++){
        //       System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //     }
        //     System.out.println();
        //   }


        // BUTTERFLY PATTERN
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //     }
            
        //     for(int j=1; j<=2*(n-i); j++){
        //       System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //     }
        //     System.out.println();
        //   }
          
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //     }
            
        //     for(int j=1; j<=2*(n-i); j++){
        //       System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //     }
        //     System.out.println();
        //   }


        
        // DIAMOND PATTERN 
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
              System.out.print("*");
            }
            
            for(int j=1; j<=2*(n-i); j++){
              System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
              System.out.print("*");
            }
            System.out.println();
          }
          
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
              System.out.print("*");
            }
            
            for(int j=1; j<=2*(n-i); j++){
              System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
              System.out.print("*");
            }
            System.out.println();
          }
          
          System.out.println();

    }
}
