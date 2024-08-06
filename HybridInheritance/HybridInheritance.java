class Animal{
    void eat(){
        System.out.println("i can eat");
    }
    void breath(){
        System.out.println("i cant survive without breathing");
    }
}
//fish class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("fish can swim");
    }
}


class Tuna extends Fish{
    void robust(){
        System.out.println("tuna is so robust");
    }
}

class Shark extends Fish{
    void cartilage(){
        System.out.println("shark body has made up of cartilage");
    }
}
//bird
class Bird extends Animal{
    void fly(){
        System.out.println("i can fly bro");
    }
}

class Peacock extends Bird{
    void canDance(){
        System.out.println("peacock can dance");
    }
} 

//mammals
class Mammals extends Animal{
    void walk(){
        System.out.println("i can walk");
    }
    void makeVoice(){
        System.out.println("i can make voice");
    }
}

class Dog extends Mammals{
    void canBark(){
        System.out.println("yep dog can bark");
    }
}

class Cat extends Mammals{
    void meaw(){
        System.out.println("meav meav meav meav meavm ");
    }
}

class Humam extends Mammals{
    void love(){
        System.out.println("yep i love you");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Tuna t1=new Tuna();
        t1.breath();;
        Shark s1=new Shark();
        s1.cartilage();
        Peacock p1=new Peacock();
        p1.canDance();
        Dog tommy=new Dog();
        tommy.canBark();;

        Cat c1=new Cat();
        c1.meaw();

        Humam h1=new Humam();
        h1.love();
    }


}
