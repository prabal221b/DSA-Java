package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {

    public static String firstNonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        //charater by character increasing the frequency in the array and adding them into the queue
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            q.add(currentChar);
            freq[currentChar - 'a']++;

        }
        while(!q.isEmpty() && freq[q.peek() - 'a'] != 1){
            q.remove();
        }

        //checking if queue y is empty, which means there are no repeating characters
        if(q.isEmpty()){
            return "no non repeating characters in this string";
        }
        
        return q.peek().toString();
    }
    public static void main(String[] args) {
        String str = "aabcccb";
        System.out.println(firstNonRepeating(str));
    }
}
