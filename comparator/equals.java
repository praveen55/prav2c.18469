package comparator;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String ss1 = "Ram";
			String ss2 = "sam";
			String ss3 = "sam";
			String ss4 = "Raj";
			int s = ss2.compareTo(ss3);
			if(s == 0)
			{
				System.out.println("String are same and value is : " +s);
			}
			else
			{
				System.out.println(ss1.compareTo(ss4));	
			}
			String sss1 = "sam";
			String sss2 = "Ram";
			String sss3 = "jam";
			String sss4 = "sag";
			
			int ss = sss2.compareTo(sss3);
			if(ss == 0)
			{
				System.out.println("Strings are same and value is : " +ss);
			}
			else
			{
				System.out.println("Strings are not same and value is : "+sss1.compareTo(sss4));
			}
		}
	}