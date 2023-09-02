import java.util.*;
public class Arrays1basic {
    // datatype arrayname[]=new datatype[size];
public static void main(String[] args) {
    // int marks [] = new int[50];
    // int numbers[] ={1,2,3};
    // int moreNumbers[] = {4,5,6};
    // String fruits[] = {"apple","mango","orange"};
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
   // System.out.println("length of array = " + marks.length); // CHECK LENGTH OF AN ARRAY (DOT OPERATOR)
    // int phy;
    // phy = sc.nextInt();
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("phy : "+ marks[0]);
    System.out.println("chem : "+ marks[1]);
    System.out.println("math : "+ marks[2]);

    // marks[2] = 100;            // UPDATE ARRAY(+,-,*,/)
    //marks[2] = marks[2]+1;
    // //System.out.println("math : "+ marks[2]);
    
    int percentage = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("percentage = " + percentage + "%");
    sc.close();
       
    }
    
}
