abstract class Animal {
    String color="brown";
    Animal(){
        System.out.println("animal constructor called");
    }
    void eats() {
        System.out.println("i can eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("horse constructor called");
    }
    @Override
    void walk() {
        System.out.println("walks on 4 legs");
    }

    void changeColor() {
        color = "dark brown";
    }

}

class Jadeja extends Horse{
    Jadeja(){
        System.out.println("jadeja is caleed");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("wals on 2 legs");
    }

    void changeColor() {
        color = "white";
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.changeColor();
        System.out.println(h1.color);
        
        Chicken c1 = new Chicken();
        c1.walk();

        Jadeja j1=new Jadeja();
    }
}
