import java.util.HashMap;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        //population of the country
        // used to store the two type of data at the same time
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion operation
        map.put("India", 120);
        map.put("US", 30);
        map.put("china", 150);

        System.out.println(map);

        map.put("china", 180);
        System.out.println(map);

        //search operation or lookup operation
        //two types if searches first map contains key

        if (map.containsKey("china")){
            System.out.println("key is present");
        } else{
            System.out.println("key is not present");
        }

        // get function gives us the value with key when printing the ans
        System.out.println(map.get("china"));//key exist
        System.out.println(map.get("indonesia"));//not exist
        
        //special for loop
        int arr[] = {12,15,18};
        for (int i = 0; i <3 ; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();

        for(int val: arr){
            System.out.print(val+ " ");
        }
        System.out.println();

        //for(int val:arr)
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.print(e.getValue());
        }

            // using key set
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+ " " + map.get(key));
        }

        map.remove("china");
        System.out.println(map);
    }
}
