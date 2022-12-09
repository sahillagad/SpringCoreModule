package SpringBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
	
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	B b=(B) ap.getBean("b");
	
	
	
	
	b.showB();
	
	
	
	ClassPathXmlApplicationContext cPXAC= (ClassPathXmlApplicationContext) ap;
	cPXAC.close();
	
	
	
}
}
