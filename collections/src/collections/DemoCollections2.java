package collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoCollections2 {
	public static void main(String[] args) {
	Hashtable<Integer,String> hm=new Hashtable<>();
		//adding elments we use put
		hm.put(2,"vishnu");
		hm.put(3, "kanithi");
		hm.put(1, "prasad");
		//key -no duplicate -Set
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
		//LHS map	      //i.next() Set value -typecast with a map
		Map.Entry map=(Map.Entry)i.next();
		System.out.println(map.getKey()+"   "+map.getValue());
		}
	
	
	}

}


