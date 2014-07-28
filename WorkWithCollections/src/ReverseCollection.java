import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class ReverseCollection {
	static <T> void reverse(Collection<T> collection){
		if(collection==null || collection.isEmpty())
		{ 
			return;
		}
		ArrayList<T> arrList = new ArrayList<T>();

	    for (int i = collection.size() - 1; i >= 0; i--) {
	    	arrList.add(((ArrayList<T>) collection).get(i));
	    }
	    collection.clear();
	    for(int i = 0; i<=arrList.size()-1; i++){
	    	collection.add(arrList.get(i));
	    
	    }
	  
	    
		
	}
	//public static void main(String[] args) {
		//ArrayList<Integer> myArr = new ArrayList<Integer>();
		//myArr.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 10));
		//System.out.println(myArr);
		//myArr=reverse(myArr);
		//System.out.println(myArr);


	
		
	//}

}
