package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // ----------JAVA BASED CONFIGURATION----------

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.compile();
//        Desktop desktop1 = context.getBean("desktop", Desktop.class); // it works because bydefault the name of the bean is method name and if we want specific name then
//        we use name attribute in bean tag
        // also we can call it through various name like @Bean( name = {"com2", "desktop", "desktop1"})
//        Desktop desktop1 = context.getBean("desktop1", Desktop.class);
//        desktop1.compile();

        // only one object create because we haven't used scope annotation and its using same object for both
        // use scope("prototype") to create object every time
//         Desktop desktop1 = context.getBean(Desktop.class);
//         desktop1.compile();
//         Desktop desktop2 = context.getBean(Desktop.class);
//         desktop2.compile();

//        Alien alien = context.getBean(Alien.class);
//        alien.code(); // this will give error because it depends on the computer object
        // so we have manage this by giving reference

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();








        // ---------------XML BASED CONFIGURATION------

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // at this point every bean object is created that is mentioned in the spring.xml file

//        Alien alien = (Alien) context.getBean("alien");
//        OR
//        Alien alien = context.getBean("alien",Alien.class);
//        alien.code();

    }
}
