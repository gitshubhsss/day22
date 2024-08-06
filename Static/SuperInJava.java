class Animal{
    String color;
    Animal(){
        System.out.println("animal constucor called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="browl";
        System.out.println("Horse constructor called");
        
    }
}

public class SuperInJava {
    public static void main(String[] args) {
        Horse h1=new Horse();
        System.out.println(h1.color);
    }
}
