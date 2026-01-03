public class Main {
    public static void main(String[] args) {
        String str="TV";
        String str1="Hello";
        System.out.println(StringContainsVowel(str));
        System.out.println(StringContainsVowel((str1)));
    }
    public static boolean StringContainsVowel(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}