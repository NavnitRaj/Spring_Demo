package navnit.raj.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Today is your lucky day.";
	}

	// add init method
	public void doMyStartupStuff() {
		System.out.println("HappyFortuneService: Inside doMyStartupStuff method");
	}

}
