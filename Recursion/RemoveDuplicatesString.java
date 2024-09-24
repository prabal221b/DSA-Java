public class RemoveDuplicatesString {
    public static String removeDuplicates(String str, boolean[] arr, int n,String newStr){
        
        if(n==str.length()){
            return newStr;
        }
        if(arr[str.charAt(n)-'a']!=true){
            newStr=newStr + str.charAt(n);
            arr[str.charAt(n)-'a']=true;
        }
        return removeDuplicates(str, arr, n+1,newStr);
    }
    public static void main(String[] args) {
        boolean[] arr= new boolean[26];
        String newStr="";
        System.out.println(removeDuplicates("ananyasingh",arr, 0,newStr));
    }
}
