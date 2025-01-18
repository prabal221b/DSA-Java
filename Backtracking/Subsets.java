package Backtracking;

public class Subsets {
    public static void findSubsets(String str,int idx, String newStr){
        if(idx == str.length()){
            if(newStr.length() != 0){
                System.out.println(newStr);
            }
            return;
        }
        char currentChar = str.charAt(idx);
        findSubsets(str, idx+1, newStr+currentChar);
        findSubsets(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,0,  "");
    }
}
