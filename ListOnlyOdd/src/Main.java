import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list= new ArrayList<>(Arrays.asList(2,4,6));
        System.out.println(checkForOdd(list));

    }
    public static boolean checkForOdd(List<Integer> list){

       return list.parallelStream().anyMatch(i->i%2!=0);
    }
}