package Stacks;

import java.util.Stack;

public class DuplicateBrackets {

    public static boolean hasDuplicate(String str){
        Stack<Character> s = new Stack<>();
        
       
        for(int i=0; i<str.length();i++){
            //check if closing bracket
            if(str.charAt(i) == ')'){
                //initialize count to keep track of number of operations or varibales between a pair of brackets
                int count = 0 ;
                while(!s.isEmpty() && s.peek() != '(' ){
                    //if found increase the count and pop them from the stack
                    count++;
                    s.pop();
                }
                //check if count is 0, which means there were no characters in between
                if(count == 0){
                    //if true then there are duplicate brackets in between, return true
                    return true;
                }
                //if not then pop the final opening bracket as well 
                s.pop(); 
            }
            else{
                s.push(str.charAt(i));
            }
            
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        String str = "(((a+b)+(a+c)))";
        System.out.println("Duplicates brackets found : "+hasDuplicate(str));
    }
}
