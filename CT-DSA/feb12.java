import java.util.*;
public class feb12 {
 // CHECK IF A NUMBER IS A POWER  OF 2, 3, 4 USING FUNTIONS -----------> (**IMP. FOR CONTEST**)
 /*    public static boolean powOftwo(int n){
      if(n==1) return true;
      
      while(n > 1){
        if(n%2 == 0){
          n = n/2;
        }else{
          return false;
        }
            
        }
        
        return true;
    }
    
    
    public static boolean powOfthree(int n){
      if(n==1) return true;
    
      while(n > 1){
        if(n%3 == 0){
          n = n/3;
        }else{
          return false;
        }
            
        }
        return true;
    }
    
    
    public static boolean powOffour(int n){
      if(n==1) return true;

      while(n > 1){
        if(n%4 == 0){
          n = n/4;
        }else{
          return false;
        }
            
        }
        return true;
    }
  
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      if(powOftwo(n) == true){
        System.out.println("Power of two");
      }
      
      if(powOfthree(n) == true){
        System.out.println("Power of Three");
      }
      
      if(powOffour(n) == true){
        System.out.println("Power of Four");
      }
    }                                           */



//HARSHAD NUMBER USING FUNCTIONS
public static boolean isHarshadNum(int n){
    int sum = 0;
    int copy = n;
    
    while(n != 0){
     // int rem = copy % 10;         //get last digit 
          sum += n%10;              // add it to the sum
          n /= 10;                // removing last digit
    }
    
    // if(sum != 0 && n % sum == 0){
    //         return 1;
    //     }
    //     return -1;
    
    if(copy%sum == 0){
      return true;
    }else{
      return false;
    }
    
  }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      if(isHarshadNum(n) == true){                   //best way to print in hackerrank etc.
        System.out.println("Harshad Number");
      }else{
        System.out.println("Not a Harshad Number");
      }
      
     // System.out.println(isHarshadNum(n));       //for printing directly
      
    }

  }  


  //break is used only inside conditional statements 
