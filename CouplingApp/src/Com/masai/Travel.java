package Com.masai;

// dependent class
public class Travel {

	Car car=new Car();// has-A Relationship
	
	
	public void journey() {
        car.start();
        System.out.println("Jounrney Started.....");		
	}
}
