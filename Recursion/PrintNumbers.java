public class PrintNumbers {
    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void printDecreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static int sumOfNumbers(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfNumbers(n-1);
    }
    public static void main(String[] args) {
        printIncreasing(10);
        System.out.println();
        printDecreasing(10);
        System.out.println();
        System.out.print("Sum of first 10 Natural Numbers "+sumOfNumbers(10));
    }
}
