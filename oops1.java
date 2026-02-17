public class oops1 {
    //EXAMPLE 1
  /*   public static void main(String[] args) {
      Student s1 = new Student();
      s1.name = "Aisha";
      s1.age = 20;
      s1.rollNo = 012650;
      
      Teacher t1 = new Teacher();
      t1.name = "Sonendra";
      t1.age = 48;
      t1.empId = 564;
      
      System.out.println(t1.name);
      System.out.println(s1.age);
    }
    
}

    class Student{
      String name;
      int rollNo;
      int age;
    }
    
    class Teacher{
      String name;
      int age;
      int empId;
    }                         */



     // EXAMPLE 2
      public static void main(String[] args) {
      Child c1 = new Child();
      c1.name = "Aisha";
      c1.age = 15;
      c1.gender = "Female";
      c1.eyeColor = "Blue";
      System.out.println(c1.name);
      
      grandChild g1 = new grandChild();
      
    }
}
     class Parent{
      String name;
      int age;
      String gender;
    }
    
    
    class Child extends Parent{
      String eyeColor;
    }
    
    
    class grandChild extends Child{
      
    }

