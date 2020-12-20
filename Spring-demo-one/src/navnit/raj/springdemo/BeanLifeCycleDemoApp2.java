package navnit.raj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp2 {

	public static void main(String[] args) {
		//  load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		//retrive bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
