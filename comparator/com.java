package comparator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

		public class com {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<student> list = new ArrayList<student>();
				list.add(new student(1,"Ec","ram\t",50));
				list.add(new student(2,"mec","raj\t",40));
				list.add(new student(3,"EEE","sam\t",60));
				
				System.out.println("name sort");
				Collections.sort(list, new namecomp());
				Iterator<student> itr = list.iterator();
				while(itr.hasNext())
				{
					student s1=(student)itr.next();
					System.out.println("ID : " +s1.id + " " + "DEPARTNMENT : " +s1.department + " " + "NAME : " +s1.name + " " + "AGE : " +s1.age );
				}
				System.out.println("id sort");
				Collections.sort(list, new idcom());
					Iterator<student> itr1 = list.iterator();
					while(itr1.hasNext())
					{
						student s1=(student)itr1.next();
						System.out.println("ID : " +s1.id + " " + "DEPARTNMENT : " +s1.department + " " + "NAME : " +s1.name + " " + "AGE : " +s1.age );
				}
					System.out.println("department sort");
					Collections.sort(list, new deptcomp());
					Iterator<student> itr2 = list.iterator();
					while(itr2.hasNext())
					{
						student s1=(student)itr2.next();
						System.out.println("ID : " +s1.id + " " + "DEPARTNMENT : " +s1.department + " " + "NAME : " +s1.name + " " + "AGE : " +s1.age );
			}
	}

}
