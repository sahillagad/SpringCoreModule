package Com.masai1;

// dependent class
public class Travel {

	
	Vehicle v1=new Bike();
//	Vehicle v1=new Car();
	
	public void journey() {
        v1.go();
        System.out.println("Jounrney Started.....");		
	}
}
