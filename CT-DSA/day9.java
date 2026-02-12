import java.util.Scanner;

public class day9 {
  // POWER OF FOUR
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      if(n <= 0){
        System.out.println(false);
      } else {
        
      boolean check = true;
      while(n != 1){
            if(n % 4 == 0){
                n = n / 4;
            }else{
                check = false;
                break;
            }
        }
        
        if(check == true){
          System.out.println(true);
        }else {
          System.out.println(false);
        }


        //ARMSTRONG NUMBER
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int sum = 0;
      int dc = 0;
      int dum = n;    // dummy variable to store the value of n ----> it becomes 0
      int copy = n;   // so we copy it to another variable
      
      while(n != 0){      //to count digits
        dc = dc + 1;
        n = n / 10;
      }
      
      while(dum != 0){
        int rem = n % 10;
        sum = sum + (int)Math.pow(rem, dc);
        dum = dum / 10;
      }
      
      if(copy == sum){
        System.out.println("Armstrong No.");
      }else{
        System.out.println("Not a Armstrong No.");
      }
    }
}
