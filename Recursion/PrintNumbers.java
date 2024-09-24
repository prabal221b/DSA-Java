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

    // public static int power(int num, int pow){
    //     if(pow==0){
    //         return 1;
    //     }
    //     if(pow%2==0){
    //         return power(num,pow/2) * power(num,pow/2);
    //     }
    //     else{
    //         return num * power(num,pow/2) * power(num,pow/2);
    //     }
        
    // }
    public static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        int halfPower = power(num,pow/2);
        int result = halfPower * halfPower;
        if(pow%2!=0){
            result = num * result;
        }

        return result;
        
    }
    
    public static void main(String[] args) {
        printIncreasing(10);
        System.out.println();
        printDecreasing(10);
        System.out.println();
        System.out.println("Sum of first 10 Natural Numbers "+sumOfNumbers(10));
        System.out.println("5 to the power of 3 equal "+power(5,3));
    }
}
