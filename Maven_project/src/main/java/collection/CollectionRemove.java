package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionRemove 

{

		public static void main(String[] args) 
		{
			ArrayList<String> a = new ArrayList<String>();
			a.add("sanju");
			a.add("shithu");
			a.add("anju");
			a.add("jithin");
			Iterator it = a.iterator();
			while(it.hasNext())
			System.out.println(it.next());
			
			//System.out.println(a);
			a.remove(1);
			//System.out.println(a);

			
			int c=a.size();
			//System.out.println(c);

			a.removeAll(a);
			//System.out.println(a);
			boolean x=a.contains("sanju");
			//System.out.println(x);




		}
}
