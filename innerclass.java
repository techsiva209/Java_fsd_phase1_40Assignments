public class innerclass {
	   public Customer getCustomer() {
		   return new Customer();
		     }

		     class Customer {

		   private Integer id;
		   private String firstName; 
		   private String lastName;
		   private String email;

		   public Customer(){

		          }

		   public Integer getId() {
		    return id;
		   }

		   public void setId(Integer id) {
		    this.id = id;
		   }

		   public String getFirstName() {
		    return firstName;
		   }
		   public void setFirstName(String firstName) {
			   this.firstName = firstName;
			  }

			  public String getLastName() {
			   return lastName;
			  }

			  public void setLastName(String lastName) {
			   this.lastName = lastName;
			  }

			  public String getEmail() {
			   return email;
			  }

			  public void setEmail(String email) {
			   this.email = email;
			  } 
			    }
		     public static void main(String[] args) {

		    	 innerclass outer = new innerclass();  
		    	 Customer customer = outer.getCustomer();

		    	 customer.setId(1);
		    	 customer.setFirstName("Ravi");
		    	 customer.setLastName("Teja");
		    	 customer.setEmail("raviteja@.com");

		    	 System.out.println("FirstName : " + customer.getFirstName());
		    	 System.out.println("LastName : " + customer.getLastName());
		    	 System.out.println("Email : " + customer.getEmail());
		    	 System.out.println("id:" +customer.id);


}

}
