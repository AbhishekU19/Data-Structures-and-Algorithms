public class Arrays2 {
   // arrays are always call by reference i.e changes in functions will reflect in main function also
   
    public static void update(int marks[],int nonchangable){
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
        public static void main(String[] args) {

            int marks[] = { 97,95,94};
            int nonchangable = 5;

            update(marks, nonchangable);
            System.out.println(nonchangable);

        
//  PRINT OUR MARKS
        for(int i=0 ; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();   
    }  
}
