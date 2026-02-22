package org.Alam;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creating IoC container with spring.xml configuration
        Student st = context.getBean(Student.class, "student");
        st.setStudentId(1);
        st.setsName("Mahboob");
        st.setsAge(24);

        Student st1 = context.getBean(Student.class, "student");
        st1.setStudentId(2);
        st1.setsName("Mahfooz");
        st1.setsAge(2);

        System.out.println(st);
        System.out.println(st1);

    }
}
