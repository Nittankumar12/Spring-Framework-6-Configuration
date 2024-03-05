package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.sql.rowset.spi.TransactionalWriter;

@Configuration
@ComponentScan("org.example") // if we dont want to write the configuration class content then we can
// add componentscan and component in every class whose object we want to create

public class AppConfig {


//    @Bean
//    @Bean(name = "desktop1")
//    @Bean(name = {"com1", "desktop1","desktop2"})

//    @Bean  // by default every bean is singleton
//    public Desktop desktop(){
//        return new Desktop();
//    }

//    @Bean
//    @Scope("prototype")// if we want that every time a new object is created
//    public Desktop desktop(){
//        return new Desktop();
//    }

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

//    @Bean
//    public Alien alien(){
//        Alien alien = new Alien();
//        alien.setAge(23);
//        alien.setComputer(desktop()); // this will set object of desktop to the computer because desktop is implementation of computer
//        // or we can set laptop object as well
////        alien.setComputer(new Laptop());
//
//        return alien;
//    }



//    @Bean
//    public Alien alien(@Autowired Laptop com){ // this gives error because it is not mentioned here
//    public Alien alien(@Autowired Computer com){ // also we can use autowired as well to link it

//    public Alien alien(@Autowired Desktop com){ // it works because desktop object is created in this class

    // in this case we have only one bean of computer class so there is no confusion, but for computer class more than one bean then what can we have

//    public Alien alien(Computer com){
//        Alien alien = new Alien();
//        alien.setAge(23);
//        alien.setComputer(com); // this will work because spring know about the linking of the computer class to the alien class
//        return alien;
//    }



    // FOR MORE THAN ONE BEAN OF COMPUTER CLASS
    // LETS CREATE BEAN OF LAPTOP ALSO  (DESKTOP BEAN HAS CREATED ABOVE)

//    @Bean
//    @Primary // it will preffered when there is confusion between the two beans and when qualifier is not there
//    public Laptop laptop(){
//        return new Laptop();
//    }



    // in this case we use annotation called @Qualifier

//    @Bean
//    public Alien alien(@Qualifier("desktop") Computer com){
//        Alien alien = new Alien();
//        alien.setAge(23);
//        alien.setComputer(com); // this will work because spring know about the linking of the computer class to the alien class
//        return alien;
//    }

//    @Bean
//    public Alien alien(Computer com){  // if we not use there is a confusion , so we can make one of the bean as primary
//        Alien alien = new Alien();
//        alien.setAge(23);
//        alien.setComputer(com);
//        return alien;
//    }



}
