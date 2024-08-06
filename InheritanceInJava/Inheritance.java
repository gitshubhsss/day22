//base class 
class Animal {
    String color;

    void eat() {
        System.out.println("zale maze jevan");
    }

    void breath() {
        System.out.println("This animal can breath");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("i can run also");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("yep i can fly");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("i can eat in the water also");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Fish chilapi=new Fish();
        // chilapi.eat();
        // Fish malavaMasa=new Fish();
        // malavaMasa.swim();;

        Mammals m1 = new Mammals();
        m1.walk();

        Fish f1 = new Fish();
        f1.swim();
        f1.eat();

        Birds b1=new Birds();
        b1.eat();
        b1.fly();

    }
}
