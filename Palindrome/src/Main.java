public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("ab%&&&"));

    }
    public static boolean isPalindrome(String str){

        //ignore spaces and nonalphanumeric characters
        str=str.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(str);

        int l=0,r=str.length()-1;

        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
              return false;
            }
            l++;
            r--;
        }
        return true;
    }
}