package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
   private int age;
//   private Laptop lap;
//   private Computer computer; // still this is giving error because it is unable to
//   check which bean to be preffered among the laptop,desktop

//    @Autowired
//    private Computer computer;    // still this is giving error because it is unable to
//   check which bean to be preffered among the laptop,desktop
    // so we can use qualifier here, but the name of qualifier should be class name(small letters)
// for specific name of qualifier we can use it in @Component("laptop") like this

//    @Autowired
//    @Qualifier("laptop") // we can use primary also, on top of the class we can use primary
    // but in comparison of qualifier and primary, qualfier wins
//    private Computer computer;


    // DONE USING AUTOWIRED
    // FIELD INJECTORS
    //CONSTRUCTOR INJECTORS
    // SETTER INJECTORS

    // SCOPE AND VALUE
    // SCOPE IS WRITTEN AT THE TOP OF THE CLASS
    //VALUE IS USED ABOVE THE OBJECT WHOSE VALUE WE WANT LIKE AGE
    @Autowired
    private Computer computer;



   public Alien(int age){
       System.out.println("Para constructor called");
       this.age = age;
   }
//   public Alien(int age, Laptop lap){
//       System.out.println("Alien with two para called ");
//       this.age = age;
//       this.lap = lap;
//   }
//
//    public Laptop getLap() {
//        return lap;
//    }

//    public void setLap(Laptop lap) {
//        System.out.println("Laptop setter in Alien Called");
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Alien age Setter called");
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("desktop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien(){
        System.out.println("Alien Object Created");
    }
    public void code(){
        System.out.println("Coding");
        computer.compile();
    }
}
