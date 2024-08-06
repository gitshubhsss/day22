class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eatss grass");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Deer d1=new Deer();
        d1.eat();;
    }
}
