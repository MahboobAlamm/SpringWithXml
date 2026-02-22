package org.Alam;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creating IoC container with spring.xml configuration
        Student st = context.getBean("student", Student.class);
        st.setStudentId(1);
        st.setsName("Mahboob");
        st.setsAge(24);
        System.out.println(st);
        st.code();

//        Student st1 = context.getBean("student", Student.class);
//        st1.setStudentId(2);
//        st1.setsName("Mahfooz");
//        st1.setsAge(25);

//        System.out.println(st1);

    }
}
