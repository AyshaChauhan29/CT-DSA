import java.util.*;
public class Jan18 {
    public static void main(String args[]){
        // ----------------------------------------> CHECK IF A NUMBER IS FULL PRIME OR NOT  <---------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
    

        // boolean check = true;
        // while(N > 0){
        //     int rem = N % 10;
        //     if(rem == 0 || rem == 1 || rem == 4 || rem == 6 || rem == 8 || rem == 9 ){
        //         check = false;
        //         break;
        //     }
        //     N = N / 10;
        // }
        // if(check == false){
        //     System.out.println(false);
        // }else{
        //     System.out.println(true);
        // }


        //  ---------------------------------------------> TRIBONACCI SERIES   <-----------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if(n == 0 || n == 1){
        //     System.out.println(0);;
        // }else if(n == 2){
        //     System.out.println(1);
        // }else{
        //     int trib1 = 0;
        //     int trib2 = 1;
        //     int trib3 = 1;
        //     int sum = 0;

        //     for(int i=3; i<=n; i++){
        //         sum = trib1 + trib2 + trib3;
        //         trib1 = trib2;
        //         trib2 = trib3;
        //         trib3 = sum;
        //     }
        //     System.out.println(sum);
        // }


        //    ----------------------------------------------> CLIMBING STAIRS <-------------------------------------------------------------
       /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //Base Case
        if(n == 1 || n == 2){
            System.out.println(n); 
        }

        int a = 1;
        int b = 2;
        int sum = 0;

        for(int i=3; i<=n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);      */



        // --------------------------------------------------> MIRROR DISTANCE OF AN INTEGER <--------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();
        
        //Base Case
        if(n == 0){
            System.out.println(n); 
        }

        int rev = 0;
        int orig = n;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse of n is : " + rev);

        int diff = rev - orig;
        System.out.println("The difference of these two is : " + diff);

        if(diff < 0){
            diff = - diff;
        }

        System.out.println(diff);
    }
    
}
