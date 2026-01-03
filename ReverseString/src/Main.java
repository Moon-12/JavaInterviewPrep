public class Main {
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        StringBuilder reversedStr=new StringBuilder();
       char[] charArr= str.toCharArray();
       for(int i=charArr.length-1;i>=0;i--)
       {
           reversedStr.append(charArr[i]);
       }
        return reversedStr.toString();
    }
}