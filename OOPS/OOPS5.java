// Static Keyword
public class OOPS5 {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.schoolName="BBHS";

        Student s2= new Student();
        

        System.out.println(s2.schoolName);
        
        Student s3 = new Student();
        s3.schoolName="ABC";


    }
}
class Student{
    String name;
    int roll;
    String schoolname= "abc";
    static String schoolName;
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }

}