import java.util.ArrayList;
import java.util.Iterator;

class ArrayListImpl{
    public static void main(String[] args) {
        ArrayList<String> name_list = new ArrayList<>(); // Creating a list
        // Adding elements to the list
        name_list.add("Viresh");
        name_list.add("Harshi");
        name_list.add("Luffy");
        // Iterating through the list
        Iterator<String> itr = name_list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}