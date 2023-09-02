public class Pattern {
    public static void main(String[] args) { 
    

       // NESTED LOOP STAR PATTERN 
       
        for(int line=0; line<20;line++){ // OUTER LOOP ONE LINE
            for(int star=0; star<line+1; star++){ // INNER LOOP
                System.out.print("*"); // PRINT STAR
            }    System.out.println();
        }          // STAR NEXT LINE*
       


           // INVERTED STAR PATTERN
            int n = 20;          
            for(int lines=1; lines<=n;lines++){ // OUTER LOOP ONE LINE
                for(int star=1; star<=n-lines+1; star++){ // INNER LOOP
                    System.out.print("*"); // PRINT STAR
                }
    
                System.out.println();          // STAR NEXT LINE
                
            }
                
        }

        
    }
    

             