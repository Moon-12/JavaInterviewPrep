import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;


public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer>scores=new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        Map<String,Integer> treeMapAsc=new TreeMap<>(scores);
        System.out.println(treeMapAsc);

        Map<String,Integer> treeMapDesc=new TreeMap<>(Comparator.reverseOrder());
        treeMapDesc.putAll(scores);
        System.out.println(treeMapDesc);

        sortHashMapDesc(scores);
        sortHashMapAsc(scores);


    }
    public static void sortHashMapAsc(HashMap<String,Integer>scores){
       Map<String,Integer>sortedMap= scores.entrySet().stream().sorted(comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldVal,newVal)->newVal,LinkedHashMap::new));
        System.out.println(sortedMap);

    }
    public static void sortHashMapDesc(HashMap<String,Integer>scores){
        Map<String,Integer>sortedMap=  scores.entrySet().stream().sorted(comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal,LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}