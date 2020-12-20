package navnit.raj.springdemo;

public class TrachCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrachCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public TrachCoach() {

	}

	@Override
	public String getDailyWorkout() {
		return "TrachCoach: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrachCoach: Inside doMyStartupStuff method");
	}
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrachCoach: Inside doMyCleanupStuff method");
	}
}
