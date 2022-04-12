package az.spring.demo;

public class Notifications  {
    private Message message;
    private Employee employee;
    public Notifications(Message message,Employee employee) {
        this.message = message;
        this.employee=employee;
    }
//
//    public Notifications() {
//
//    }

    public void alert(){
        System.out.println("Notifications....");
        message.send();
        System.out.println(employee);

    }

//    public void setMessage(Message message) {
//        this.message = message;
//    }
}
