package navnit.raj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmail());
		// close the context
		context.close();

	}

}
