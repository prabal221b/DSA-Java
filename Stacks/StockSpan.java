package Stacks;

import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int price[], int span[]){

        Stack<Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1; i<price.length;i++){
            int currPrice = price[i];
            while(!s.isEmpty() && currPrice > price[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
                
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
                
            }
        }

        return span;
    }
    public static void main(String[] args) {
        int stockPrice[] = {100,80,60,70,60,85,100};
        int span[] = new int[stockPrice.length];

        stockSpan(stockPrice, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }

    }
}
