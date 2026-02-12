public class Day8 {
    public static void main(String args[]){
    //Second Approach withot using a third variable
      // int a= 5;
      // int b = 10;
      
      // a = a + b;
      // b = a - b;
      // a = a - b;
      
      // System.out.println(a);
      // System.out.println(b);
      
      //Swapping ---> 1st Approach using temp
      // int a = 5;
      // int b = 10;
      // int temp = a;
      // a = b;
      // b = temp;
      
      // System.out.println(a);
      // System.out.println(b);
      
      //Find nth term of Fibonacci Series
      int n = 10;
      int fib1 = 0;     //0th term
      int fib2 = 1;    //first term
      int  sum = 0;     //nth term
      
      for(int i=2; i<=n; i++){
        sum = fib1 + fib2;
        fib1 = fib2;
        fib2 = sum;
      }
      System.out.println(sum);
    }
}
