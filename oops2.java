/* public class oops2{
    //HEIRARCHICAL INHERITANCE
      public static void main(String[] args) {
      Parent p1 = new Parent();
      p1.name = "Papa";
      p1.age = 50;
      p1.gender = "Male";
      System.out.println(p1.name);
      System.out.println(p1.age);
      System.out.println(p1.gender);
      
      
      child1 c1 = new child1();
      c1.name = "Aisha";
      c1.age = 21;
      c1.gender = "Female";
      c1.eyecolor = "Brown";
      System.out.println(c1.eyecolor);
      
      
      child2 c2 = new child2();
      c2.name = "Vishal";
      c2.age = 19;
      c2.gender = "Male";
      c2.height = 6;
      System.out.println(c2.height);
      
      child3 c3 = new child3();
      c3.name = "Yash";
      c3.age = 15;
      c3.gender = "Male";
      c3.haircolor = "Black";
      System.out.println(c3.haircolor);
      
    }
}

class Parent{
  String name;
  int age;
  String gender;
}

class child1 extends Parent{
  String eyecolor;
}

class child2 extends Parent{
  int height;
}

class child3 extends Parent{
  String haircolor;
}                                 */




//MULTILEVEL INHERITANCE
/*  public class oops2{
      public static void main(String[] args) {
      GrandParent g1 = new GrandParent();
      Parent p1 = new Parent();
      child c1 = new child();
    }
}

class GrandParent{
  String name;
  int age;
  String gender;
}

class Parent extends GrandParent{
 int height;
 String haircolor;
}

class child extends Parent{
  String eyecolor;
}                               */





//GETTERS AND SETTERS FUNCTIONS
public class oops2{
      public static void main(String[] args) {       //static bcoz no one can access/change main function, it only takes output and print it
      Student s1 = new Student();
      s1.setName("Aman");            //with the help of set we can set names etc.
      System.out.println(s1.getName());   //with the help of get we print it
    }
}

class Student{
  private String name;
  private int age;
  private String gender;
  
  public void setName(String name){      //non static rakhna padega is func ko
    this.name = name;
  }
  public String getName(){
    return name;
  }
  
  
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }
  
  
  public void setGender(String gender){
    this.gender = gender;
  }
  public String getGender(){
    return gender;
  }
}



