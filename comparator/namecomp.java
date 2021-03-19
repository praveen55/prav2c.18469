package comparator;

import java.util.Comparator;

public class namecomp implements Comparator{

	
		// TODO Auto-generated method stub
		
			public String name;
			public String age;
			public String id;
			public String department;
			@Override
			public int compare(Object a1, Object a2) {
				student s1 = (student) a1;
				student s2= (student) a2;
				return s1.name.compareTo(s2.name);
	}
}
