package practiceActivity;

import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach {

    private FortuneService fortuneService;

    public WrestlingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Learn Special Move for 30 min.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
