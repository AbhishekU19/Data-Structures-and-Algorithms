public class Stack4 {
    public static boolean isValid(String str){
        Stack <Character> s = new Stack <>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(ch == '(' || ch== '{' || ch=='[') {
                s.push(ch);
            }else{
                id(s.isEmpty()){
                    return false;
                }
                if(s.peek()== '(' && ch == ')');
            }
        }
    }
    public static void main(String[] args){


    }
    
}
