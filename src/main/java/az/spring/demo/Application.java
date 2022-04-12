package az.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        Sms sms = new Sms();
//        Email email = new Email();
//        Notifications notification=new Notifications(sms);
//
//         notification = new Notifications(email);
//        notification.alert();
//        notification.alert();

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Notifications notifications=context.getBean("notification",Notifications.class);
        notifications.alert();
    }
}
