import java.util.*;

class ArrayListImpl{
    public static void main(String[] args) {
        List<String> name_list = new ArrayList<>(); // Creating a list
        // Adding elements to the list
        name_list.add("Viresh");
        name_list.add("Harshi");
        name_list.add(2, "Zoro");
        name_list.add("Luffy");

        // Iterating through the list
        Iterator<String> itr = name_list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // Getting an element from the list
        System.out.println("Element at 1st index: " + name_list.get(1));

        // Updating an element of the list
        name_list.set(2, "Monkey D. Luffy");
        for (String name : name_list) {
            System.out.println(name);
        }   

        // Removing an element from the list
        name_list.remove(0);
        name_list.remove("Monkey D. Luffy");
        System.out.println(name_list);

        // Extending one list to other
        List<String> name_list_2 = new ArrayList<>();
        name_list_2.add("Viresh");
        name_list_2.add("Luffy");
        name_list.addAll(name_list_2); 
        System.out.println(name_list);

        // Checking if an element exists in a list
        System.out.println(name_list.contains("Viresh"));

        // Getting the index of an element
        System.out.println(name_list.indexOf("Harshi"));
    }
}