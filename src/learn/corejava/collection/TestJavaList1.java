package learn.corejava.collection;
import java.util.*;

public class TestJavaList1 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("c");
		l1.add("cpp");
		l1.add("html");
		l1.add("javascript");
		l1.add(2,"css");
		
/*      String[] arr=l1.toArray(new String[l1.size()]);
		System.out.println(Arrays.toString(arr));
		System.out.println(l1);   */
        
		ListIterator<String> itr=l1.listIterator();
		while(itr.hasNext()) {
			System.out.println("index: "+itr.nextIndex()+ "value: "+itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println("index: "+itr.previousIndex()+ "value: "+itr.previous());
		}
	}

}
