package hashset1;

import java.util.HashSet;

public class Tester1 {

	public static void main(String[] args) 
	{
		HashSet<User> hs = new HashSet<User>();
		User u1 = new User(123,"abc@gmail.com","dev");
		User u2 = new User(456,"abcd@gmail.com","dhg");
		User u3 = new User(123,"abcd@gmail.com","fdn");
		User u4 = new User(1234,"def@gmail.com","devdf");
		
		
		
		 System.out.println("added" + hs.add(u1));
		 System.out.println("added" + hs.add(u2));
		 System.out.println("added" + hs.add(u3));
		 System.out.println("added" + hs.add(u4));
		 System.out.println(hs.size());
		 //System.out.println(hs);
		 for (User u : hs)
			 System.out.println(u);



	}

}
