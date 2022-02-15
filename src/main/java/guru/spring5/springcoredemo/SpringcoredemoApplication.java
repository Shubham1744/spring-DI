package guru.spring5.springcoredemo;

import guru.spring5.springcoredemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoredemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringcoredemoApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greetings = myController.sayHello();
        System.out.println(greetings);
    }

}
