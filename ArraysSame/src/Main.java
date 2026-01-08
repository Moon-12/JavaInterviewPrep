import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[]arr1=new int[]{1,2,4};
        int[]arr2=new int[]{4,2,1,4,4,4};
        System.out.println(isArraySame(arr1,arr2));

    }
    //ignore order and duplicates
    public static boolean isArraySame(int[]arr1,int[]arr2){
        Set<Integer> hashset1=new HashSet<>();
        Set<Integer> hashset2=new HashSet<>();

        for(Integer n:arr1){
            hashset1.add(n);
        }
        for(Integer n:arr2){
            hashset2.add(n);
        }

    return hashset1.equals(hashset2);

    }
}