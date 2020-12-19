package navnit.raj.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("inside setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("inside constructut");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
