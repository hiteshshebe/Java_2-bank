package hashset1;

public class User {
	private int id;
	private String email;
	private String name;
	
	public User(int id, String email, String name) 
	{
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}
	@Override
	public String toString() {
		return "";
	}
	
	  public boolean equals(Object obj) 
	  {
		  System.out.println("In users equals");
	     if(obj instanceof User) 
	     {
	    	 User u=(User)obj; 
	    	 return this.id==u.id && this.email.equals(u.email); 
	  } 
	     return false; 
	     }
	  
	  @Override public int hashCode() {
	  
	  return 17*id*email.hashCode(); }
	  
	  
	  
	 
	 
	

}
