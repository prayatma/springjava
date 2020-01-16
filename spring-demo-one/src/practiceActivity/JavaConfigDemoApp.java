package practiceActivity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(EntertainmentConfig.class);

        Coach theCoach = annotation.getBean("wrestlingCoach", WrestlingCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        annotation.close();


    }
}
