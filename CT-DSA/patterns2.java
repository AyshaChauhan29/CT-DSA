import java.util.*;
public class patterns2 {
    
  public static void printTriangularPattern1(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      public static void printTriangularPattern2(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i+1; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      public static void printTriangularPattern3(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=i; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      public static void printTriangularPattern4(int n){
        for(int i=n; i>=1; i--){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=i; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      public static void printPyramidPattern(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      public static void printSDiamondPattern(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        
        for(int i=n; i>=1; i--){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      public static void printHollowDiamondPattern(int n){
        
      }
      
      
      
      public static void printHalfButterflyPattern(int n){
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
      
      
      
      public static void printButterflyPattern(int n){
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
        
        for(int i=n-1; i>=1; i--){
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
      
      
      
      public static void printAlphaPattern(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            System.out.print(ch++);
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      public static void printAlphaPattern2(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            System.out.print(ch);
          }
          System.out.println();
          ch++;
        }
        System.out.println();
      }
      
      
      
      public static void printFloydsTrianglePattern(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            System.out.print(count++);
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      public static void printBinaryPattern(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            if(i % 2 == 0){
              if(j % 2 == 0){
                System.out.print(1);
              }else{
                System.out.print(0);
              }
            }else{
              if(j%2 == 0){
                System.out.print(0);
              }else{
                System.out.print(1);
              }
            }
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      printTriangularPattern1(n);
      printTriangularPattern2(n);
      printTriangularPattern3(n);
      printTriangularPattern4(n);
      printPyramidPattern(n);
      printSDiamondPattern(n);
      printHollowDiamondPattern(n);
      printHalfButterflyPattern(n);
      printButterflyPattern(n);
      printAlphaPattern(n);
      printAlphaPattern2(n);
      printFloydsTrianglePattern(n);
      printBinaryPattern(n);
      
    }
}

