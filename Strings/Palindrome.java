import java.util.Scanner;
public class Palindrome{
    public static boolean isPalindrom(String ads){
        for(int i=0;i<ads.length()/2;i++){
            if(ads.charAt(i)!=ads.charAt(ads.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String ads[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String to check for palindrome: ");
        String asd=sc.nextLine();
        System.out.println(isPalindrom(asd));
    }
}