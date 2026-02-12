import java.util.*;

public class Day5 {
    public static void main(String args[]){
       // int n = 10;

        //PRINT HELLOWORLD USING LOOPS --->WHILE AND FOR
       /*  for(int i=1; i<=n; i++){
            System.out.println("Yash is GOAT!!");
        }

        int i=1;
        while(i<=n){
            System.out.println("Yash Noob");
            i=i+1;
        }        */


        //Print no. from 1 to n using loops
      /*   for(int i=1; i<=n; i++){
            System.out.println(i);
        }

        int i=1;
        while(i<=n){
            System.out.println(i);
            i=i+1;
        }          */


        //Print Sum of n Natural numbers
    //    int sum = 0;
    //    for(int i=1; i<=n; i++){
    //       sum += i;
    //    }
    //    System.out.println(sum);


        
        //   int sum = 0;
        //   int i=1;
          
        //   while(i<=n){
        //     sum += i;
        //     i++;
        //   }
        //   System.out.println(sum);

    //Print sum of even nos. from 1 to n
    /*    int sum = 0;
       for(int i=2; i<=n; i=i+2){    
          sum += i;
       }
       System.out.println(sum);     */


    //    Q → print all even/odd integers from 1 to n
    //    Even --> int i = 2; i<=n; i=i+2
    //    Odd --> int i = 1; i<=n; i=i+2
    /*      for(int i=2; i<=n; i=i+2){     // for even
            System.out.println(i);
          }
 
          System.out.println();

          for(int i=1; i<=n; i=i+2){    // for odd
            System.out.println(i);
          }                                  */


    // Q--> factor of N 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int  i= 1; i<=n; i=i+1){
        //     if(n % i == 0){
        //         System.out.print(i + ",");
        //     }
        // }

        // int i=1;
        // while(i<=n){
        //     if(n % i == 0){
        //         System.out.print(i + ",");
        //     }
        //     i=i+1;
        // }


    // Q--> Check whether N is prime or Not --> true/false
        int count = 0;
        for(int i=1; i<=n; i++){
           if(n % i == 0){
            count += 1;
           }
        }
        

        if(count == 2){
            System.out.println(n + " is a prime Number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }

    
    // // Q--> Count digits in N --> N = 2213423 -> count  = 0
    //     int count = 0;
    //     for(int i=1; i<=n; i++){
    //         count += 1;
    //         n = n/10;
            
    //     }
    //     System.out.println(count);

    }
}
