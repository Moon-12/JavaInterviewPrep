public class Main {
    public static void main(String[] args) {

        String str="rara  ahhabn a";
        String modifiedStr=str.replace(" ","");
        String modifiedStr1=str.replaceAll("[\s+]","");
        System.out.println(modifiedStr1);
        System.out.println(modifiedStr);

        String str1= "  abc  def\t";
        System.out.println(str1.strip());
        System.out.println(str1.trim());
    }
}