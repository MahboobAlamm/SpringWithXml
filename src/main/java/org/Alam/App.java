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

        System.out.println(st);

    }
}
