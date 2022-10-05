import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        //creation
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> List = new ArrayList<>();


        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //printing the size of the set(it takes only unique elements)
        System.out.println("size of the set is"+ set.size());

        //print all elements
        System.out.println(set);

        //search --> contains
        if (set.contains(1)){
            System.out.println("set contains one");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("contain one");
        }

        //iterator
        Iterator it = set.iterator();
        //hasnext and next function

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
