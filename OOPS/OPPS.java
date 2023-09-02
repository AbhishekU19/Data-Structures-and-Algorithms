public class OPPS {

  public static void main(String[] args) {
      Student s1 = new Student();
      s1.setName("Abhishek");
      s1.setRoll(169);
      s1.setPassword("1234");
      s1.setMarks(new int[]{100, 90, 80});
      Student s2 = new Student(s1); // copy
      s2.setPassword("xyz");
      for (int i = 0; i < 3; i++) {
          System.out.println(s2.getMarks()[i]);
      }
  }
}

class Student {
  private String password;
  private String name;
  private int roll;
  private int marks[];

  // Default Constructor
  Student() {
      marks = new int[3]; // Initialize the marks array
      System.out.println("constructor is called....");
  }

  // Copy Constructor (Deep Copy)
  Student(Student s1) {
      marks = new int[3]; // Initialize the marks array
      this.name = s1.name;
      this.roll = s1.roll;
      for (int i = 0; i < marks.length; i++) {
          this.marks[i] = s1.marks[i];
      }
  }

  // Constructor with name parameter
  Student(String name) {
      marks = new int[3]; // Initialize the marks array
      this.name = name;
  }

  // Constructor with roll parameter
  Student(int roll) {
      marks = new int[3]; // Initialize the marks array
      this.roll = roll;
  }

  // Getter and Setter methods for private fields
  public String getPassword() {
      return password;
  }

  public void setPassword(String password) {
      this.password = password;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getRoll() {
      return roll;
  }

  public void setRoll(int roll) {
      this.roll = roll;
  }

  public int[] getMarks() {
      return marks;
  }

  public void setMarks(int[] marks) {
      this.marks = marks;
  }
}

// public class OPPS {
//   public static void main(String[] args) {
//       Student s1 = new Student();
//       // System.out.println(s1.name);
//       s1.name = "Abhishek";
//       s1.roll = 169;
//       s1.password = "1234";
//       s1.marks[0] = 100;
//       s1.marks[1] = 90;
//       s1.marks[2] = 80;
//       Student s2 = new Student(s1); // copy
//       s2.password = "xyz";
//       for (int i = 0; i < 3; i++) {
//           System.out.println(s2.marks[i]);
//       }
//   }
// }

// class Student {
//   public String password;
//   String name;
//   int roll;
//   int marks[];

//   // Default Constructor
//   Student() {
//       marks = new int[3]; // Initialize the marks array
//       System.out.println("constructor is called....");
//   }

//   // Copy Constructor (Deep Copy)
//   Student(Student s1) {
//       marks = new int[3]; // Initialize the marks array
//       this.name = s1.name;
//       this.roll = s1.roll;
//       for (int i = 0; i < marks.length; i++) {
//           this.marks[i] = s1.marks[i];
//       }
//   }

//   // Constructor with name parameter
//   Student(String name) {
//       marks = new int[3]; // Initialize the marks array
//       this.name = name;
//   }

//   // Constructor with roll parameter
//   Student(int roll) {
//       marks = new int[3]; // Initialize the marks array
//       this.roll = roll;
//   }
// }

// constructors
// // if constructor is not called it is by default created by java 
// public class OPPS {

//     public static void main(String[] args) {
//        Student s1= new Student();
//       // System.out.println(s1.name);
//       s1.name="Abhishek";
//       s1.roll=169;
//       s1.password="1234";
//       s1.marks[0]=100;
//       s1.marks[1]=90;
//       s1.marks[2]=80;
//       Student s2= new Student(s1); //copy
//       s2.password="xyz";
//      for(int i=0;i<3;i++) {
//        System.out.println(s2.marks[i]);
//      }

//     }
    
// }
// class Student {
//       public String password;
//       String name;
//       int roll;
//       int marks[];
// // shalow /copy constructor               
//     // Student(Student s1){
//     //   marks = new int[3];
//     //   this.name=s1.name;
//     //   this.roll= s1.roll;
//     //   this.marks= s1.marks;
//     // }
//     //Deep Copy Constructors
//     Student(Student s1){
//        marks = new int[3];
//        this.name=s1.name;
//        this.roll= s1.roll;
//        for(int i=0; i<marks.length;i++){
//         this.marks[i]= s1.marks[i];
//        }
//      System.out.println(s1);

//     }
//     Student(){
//       marks= new int[3];
//         System.out.println("constructor is called....");
//     }
//     Student(String name){
//       marks = new int[3];
//       this.name= name;
//     } 
//     Student(int roll){
//       marks = new int[3];
//       this.roll = roll;
//     }
// }   