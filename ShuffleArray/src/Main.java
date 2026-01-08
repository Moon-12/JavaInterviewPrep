import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[]arr=new int[]{1,2,3,4,5};
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            int indexToSwap=random.nextInt(arr.length);
            int temp=arr[indexToSwap];
            arr[indexToSwap]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}