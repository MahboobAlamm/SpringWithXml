package org.Alam;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creating IoC container with spring.xml configuration

        Student st = (Student) context.getBean("student");  // casting as getBean by default Object
//        st.code(); // concept of interface
        System.out.println("st : " + st);  //only comp is defined

//        Student st1 = context.getBean("studentNoArgs", Student.class);
//        System.out.println("st1 : " + st1);
//
//        Student st2 = context.getBean("studentWithAllArgs", Student.class);
//        System.out.println("st2 : " + st2);

    }
}
