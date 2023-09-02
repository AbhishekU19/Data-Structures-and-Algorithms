public class Strings2 {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }

        }
    return true;
}
public static float shortestPath(String Path){
    int x=0, y=0;
    for(int i=0;i<Path.length(); i++){
        char dir=Path.charAt(i);

        // South
        if(dir == 'S'){
            y--;
        }
        // North
        else if (dir =='N' ){
            y++;
        }
        // West
        else if(dir=='W'){
        x--;
        }
        // East
        else {
        x++;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2 + y2);
}
public static void main(String[] args) {
   // String str="racecar";
   // System.out.println(isPalindrome(str));
   String Path="WNEENESENNN";
   
   System.out.println(shortestPath(Path));
}
}
