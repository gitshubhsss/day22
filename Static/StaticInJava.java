class Student{
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name=name;
    }

    String getName(String name){
        return this.name;
    }
}
public class StaticInJava {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="Apana collage";

        Student s2=new Student();
        System.out.println(s2.schoolName);
    }
}
