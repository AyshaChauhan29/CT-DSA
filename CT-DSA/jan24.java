import java.util.*;
public class jan24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //-----------------------------------> REMOVE ZEROES IN DECIMAL REPRESENTATION --> Leetcode 3726   <-------------------------
      /*   long rev = 0;
        while(n >= 1){
          long rem = n % 10;
          if(rem != 0){
            rev = rev * 10 + rem;
          }
          n = n / 10;
        }
        long rev1 = 0;
        while(rev >= 1){
            long rem = rev % 10; 
            if(rem != 0){
                rev1 = rev1 * 10 + rem;
            } 
            rev = rev / 10;
        }
        System.out.println(rev1);   */


    //  ---------------------------------------> IF A NO. IS POWER OF 2, 3, 4 & PRINT IT <-----------------------------------------------
    /*  int n1 = n;
      int n2 = n;
      
      boolean check1 = true;
      boolean check2 = true;
      boolean check3 = true;
      
      while(n > 1){
        if(n%2 == 0){
          n = n/2;
        }else{
          check1 = false;
          break;
        }
            
        }

        while(n1 > 1){
          if(n1%3 == 0){
          n1 = n1/3;
        }else{
          check2 = false;
          break;
        }
      }

        while(n2 > 1){
          if(n2%4 == 0){
          n2 = n2/4;
        }else{
          check3 = false;
          break;
        }
      }
      
      if(check1 == true){
        System.out.println("Power of two");
      }
      if(check2 == true){
        System.out.println("Power of three");
      }
      if(check3 == true){
        System.out.println("Power of Four");     */

        


        // ------------------------------------------------------> UGLY NUMBER <---------------------------------------------------------
        while(n > 1){
            if(n % 2 == 0){
                n = n/2;
            }else if(n%3 == 0){
                n = n/3;
            }else if(n%5 == 0){
                n = n/5;
            }else{
                System.out.println("FALSE");
            }
        }
        System.out.println("TRUE");
      }
    }
}
