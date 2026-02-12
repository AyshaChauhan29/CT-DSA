import java.util.*;

public class Day4 {
    public static void main(String[] args) {
      
      //program to check whether these sides form a triangle or not
    /*int a = 10;
      int b = 5;
      int c = 6;
      
      if(a+b>c && a+c>b && b+c>a){
        System.out.println("Triangle can be formed");
      }else{
        System.out.println("Triangle can not be formed");
      }   */
      

    //program to check whether the triangle is equilateral, isosceles or scalene
    /* int a = 3;
      int b = 4;
      int c = 5;
      
      if(a+b>c && a+c>b && b+c>a){
        if(a==b && a==c && b==c){
          System.out.println("Equilateral");
        }else if(a==b || a==c || b==c){
          System.out.println("Isosceles");
        }else{
          System.out.println("Triangle is scalene");
        }
        
      }else{
        System.out.println("Triangle can not be formed");
      }   */
      
      

      // print the grades if the following marks are given to a student
     /* Scanner sc = new Scanner(System.in);
      int marks = sc.nextInt();
      
      if(marks >= 90){
        System.out.println("Grade A");
      }else if(marks>=80 && marks<=89){
        System.out.println("Grade B");
      }else if(marks>=70 && marks<=79){
        System.out.println("Grade C");
      }else if(marks>=50 && marks<=69){
        System.out.println("Grade D");
      }else if(marks>=33 && marks=<49){
        System.out.println("Grade E");
      }else{
        System.out.println("Fail");   
      }                              */
      
      
  //WHETHER IT IS A RIGHT ANGLE TRIANGLE
      int a = 3;
      int b = 3;
      int c = 5;
      
      if(a+b>c && a+c>b && b+c>a){
        if(a*a + b*b == c*c){
          System.out.println("Right angle triangle");
        }else if(b*b + c*c == a*a){
          System.out.println("Right angle triangle");
        }else if(a*a + c*c == b*b){
          System.out.println("Right angle triangle");
        }else{
          System.out.println("Valid , but not a Right angle triangle");
        }
      }else{
        System.out.println("Invalid");
      }
       
       //LOOP
      
  }
}
