package opps;

class Animal { //parent class
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal { // child class extends parent class
    String bark() {
       return "Dog is barking";
    }
}

public class Singleinheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Parent method
       d.bark(); // Child method
    	
    }
}
