package comparator;

import java.util.Comparator;


public class deptcomp implements Comparator {

			@Override
			public int compare(Object ab1, Object ab2) {
				// TODO Auto-generated method stub
				student d1 = (student)ab1;
				student d2 = (student)ab2;
				return d1.department.compareTo(d2.name);
			}
	}
