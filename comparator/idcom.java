package comparator;

import java.util.Comparator;


public class idcom implements Comparator<student>{



			@Override
			public int compare(student aa1, student aa2) {
				// TODO Auto-generated method stub
				student a1 = (student)aa1;
				student a2 = (student)aa2;
				
				if(a1.id == a2.id)
				{		
				return 0;
				}
				else if(a1.id>a2.id)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
		}