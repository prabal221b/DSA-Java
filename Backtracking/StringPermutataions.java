package Backtracking;

public class StringPermutataions {
    public static void findPermutations(String str,  String newStr){
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String subString = str.substring(0, i) + str.substring(i+1);
            findPermutations(subString, newStr+currentChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
