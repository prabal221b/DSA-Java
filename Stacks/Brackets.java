package Stacks;

import java.util.Stack;

public class Brackets {
    public static boolean isValid(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{'|| str.charAt(i) == '['){
                s.push(str.charAt(i));
            }
            else{
                if( (s.peek() == '(' && str.charAt(i) == ')') 
                    || (s.peek() == '{' && str.charAt(i) == '}') 
                    || (s.peek() == '[' && str.charAt(i) == ']') )
                s.pop();
            }
        }

        if(!s.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String str = "{([)]}";
        System.out.println(isValid(str));
    }
}
