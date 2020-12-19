package navnit.raj.springdemo;

public class BaseballCoach implements Coach {
	// define a pvt field for dependency
	private FortuneService fortuneservice;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneservice to get fortune
		return fortuneservice.getFortuneService();
	}

}
