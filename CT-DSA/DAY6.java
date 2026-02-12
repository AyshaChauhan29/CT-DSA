import java.util.*;
public class DAY6 {
        public static void main(String[] args) {
      
      //Reverse a string
      // String s = "racecar";
      // int n = s.length();
      // String rev = "";
      // for(int i=n-1; i>=0; i--){
      //   rev = rev + s.charAt(i);
      // }
      // // System.out.println(rev);
      
      
      // //Palindrome
      // if(s.equals(rev)){
      //   System.out.println("Palindrome");
      // }else{
      //   System.out.println("Not a Palindrome");
      // }
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      //Count digits
      // int count = 0;
      // while(n>0){
      //   count++;
      //   n=n/10;
      // }
      // System.out.println(count);
      
      
      //Reverse the number
      // int rev = 0;
      // while(n>0){
      //   int rem = n%10;
      //   // if(rem == 2 || rem == 3 || rem == 5 || rem == 7){  //for prime numbers in a digit
      //   //   rev = rev * 10 + rem;
      //   // }
        
      //   if(rem % 2 != 0){                    // even 
      //     rev = rev * 10 + rem;
      //   }
        
      //   n = n/ 10;
      // }
      // System.out.println(rev);
      
      int rev = 0;
      int count = 0;
      while(n>0){
        int rem = n % 10;
        if(rem == 2 || rem == 3 || rem == 5 || rem == 7){  //for prime numbers in a digit
         rev = rev * 10 + rem;
         count++;
       }
        
        n=n/10;
      }
       System.out.println(count);
      
      
  }
}

