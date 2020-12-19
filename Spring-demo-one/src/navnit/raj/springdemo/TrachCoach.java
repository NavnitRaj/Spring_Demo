package navnit.raj.springdemo;

public class TrachCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrachCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public TrachCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
