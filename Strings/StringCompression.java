public class StringCompression {
    public static StringBuilder toCompress(String abc){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<abc.length();i++){
            Integer count =1;
            while(i<abc.length()-1 && abc.charAt(i)==abc.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(abc.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb;
    }
    public static void main(String adsp[]){
        String abc="aaabbccccddeeeeee";
        System.out.println(toCompress(abc));
    }
}
