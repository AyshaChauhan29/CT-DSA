public class oops3 {
/*     public static void main(String[] args) {
      Animal A1 = new Animal();
      A1.name = "Bacardi";
      A1.age = 10;
      
      System.out.println(A1.name);
      System.out.println(A1.age);
      System.out.println(A1.AnimProp("Barks"));
      
      
      Animal A2 = new Animal();
      A2.name = "Aman";
      A2.age = 20;
      
      System.out.println(A2.name);
      System.out.println(A2.age);
      System.out.println(A2.AnimProp("Walking"));
    }
}

class Animal{    //custom
  String name;  
  int age;
  
  public String AnimProp(String properties){
  return properties;
  }
  
}               */


//METHOD OVERLOADING AND OVERRIDING
/*public static void main(String[] args) {
      int a = 10;
      int b = 45;
      int c = 0;   // dummy
      
      System.out.println(add(a, b));
      System.out.println(add(a, b, c));
    }
    
    
    public static int add(int a, int b){
      return a+b;
    }
    
    public static int add(int a, int b, int c){    //override --> overload kr denge
      return a+b+c;
    }                            */


      //ENCAPSULATION
      public static void main(String[] args) {
      BankAccount B1 = new BankAccount();
      B1.setBalance(2000);     
      System.out.println(B1.getBalance());  
      
    }
}


class BankAccount{
  private int balance = 1000;
  
  public void setBalance(int Amount){
    balance += Amount;
    this.balance = balance;
    
  }
  
  public int getBalance(){
    return balance;
  }
}