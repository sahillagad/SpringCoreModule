package Com.masai2;

// dependent class
public class Travel {

	
  private Vehicle v1;
	
     
      // constructor Injection Point
	  public Travel(Vehicle v1) {
		  this.v1=v1;
	  }

  
  
     
  
  
  
	  public void journey() {
	        v1.go();
	        System.out.println("Jounrney Started.....");		
		}


}
