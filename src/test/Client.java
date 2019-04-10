package test;

import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        Student s1 = (Student) context.getBean("s1");
        Student s2 = (Student) context.getBean("s2");

        System.out.println(s1);
        System.out.println(s2);

    }
}
