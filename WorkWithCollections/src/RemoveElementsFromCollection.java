import java.util.ArrayList;
import java.util.Collection;


public class RemoveElementsFromCollection {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("three");
        list.add("three");
        list.add(null);

        System.out.println("Prior to removal: " +list);
        removeDuplicates(list);
        System.out.println("After removal: " + list);
    }

    static <T> void removeDuplicates(Collection<T> collection) {
    
        Collection<T> temp = new ArrayList<T>();

        for(T s : collection) {
            if(!temp.contains(s) && s!=null) {
                temp.add(s);
            } 
        }

        //put the contents of temp back in the main list
        collection.clear();
        collection.addAll(temp);

        
    }
	

}
