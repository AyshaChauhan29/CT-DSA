public class feb10 {
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();
      // int count = 1;   //can not be reset
      // for(int i=1; i<=n; i++){
      //   for(int j=1; j<=i; j++){
      //     System.out.print(count + " ");   // count++ can be used here 
      //     count++;
      //   }
      //   System.out.println();
      // }
      
      //FUNCTION -----> Basics
      // class test{
      //   int a = 10;   //global variable
      //   f1(){
      //     int a = 15;   // 15    // local variable
      //   }
        
      //   f2(){
          
      //   }
        
      //   f3(){
          
      //   }
      // }


  //fibonacci, tribonacci, prime no. code using functions
      public static int fib(int n){
      if(n==0 || n==1) return n;
      int a = 0;
      int b = 1;
      int sum = 0;
      for(int i=2; i<=n; i++){
        sum = a+b;
        a = b;
        b = sum;
      }
      return sum;
  }
  
  public static int trib(int n){
      if(n==0 || n==1) return 1;
      if(n==2) return 1;
      
      int a = 0;
      int b = 1;
      int c = 2;
      int sum = 0;
      
      for(int i=3; i<=n; i++){
        sum = a+b+c;
        a = b;
        b = c;
        c = sum;
      }
      return sum;
  }
  
  
  public static boolean chkPrime(int n){
      
      int count = 0;
      
      for(int i=1; i<=n; i++){
        if(n%i == 0){
          count++;
        }
      }
      if(count == 2){
        return true;
      }else{
        return false;
      }
  }
  
  
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(fib(n));
        System.out.println(trib(n));
        System.out.println(chkPrime(n));
        
    }
}

