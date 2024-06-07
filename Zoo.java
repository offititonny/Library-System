/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TONNY OS
 */
public class Zoo {
      public static void main(String[] args) {
        Animal lion = new Lion("shaluwa", 7);
        Animal elephant = new Elephant("amunza", 8);
        Animal monkey = new Monkey("tonny", 3);

        // Demonstrate overriding methods
        lion.makeSound();
        lion.eat();

        elephant.makeSound();
        elephant.eat();

        monkey.makeSound();
        monkey.eat();

        // Demonstrate overloaded methods
        lion.makeSound(3);
        elephant.eat();
        monkey.makeSound(2);
    }
}

  
