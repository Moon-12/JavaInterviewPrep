public class Main {
    public static void main(String[] args) {
        int[]arr=new int[]{1,997,3,999};
        System.out.println(getSecondLarge(arr));

    }
    public static int getSecondLarge(int[] arr){
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>large){
                secondLarge=large;
                large=num;
            }
            else if(num>secondLarge){
                secondLarge=num;
            }
        }
        return secondLarge;
    }
}