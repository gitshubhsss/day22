interface Harbivorous{
    void eat();
}

interface Carnivorous{
    void eat();
}

class Bear implements Harbivorous,Carnivorous{
    public void eat(){
        System.out.println("it can it grass as well as meet");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b1=new Bear();
        b1.eat();
    }
}
