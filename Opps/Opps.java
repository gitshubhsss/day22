public class Opps {
    public static void main(String[] args) {
        Student s1 = new Student();//
        s1.name = "shubham shivaji ranjane";
        s1.roll = 33;
        s1.password = "Mahi@4771";
        s1.marks[0] = 56;
        s1.marks[1] = 58;
        s1.marks[2] = 60;

        Student s2 = new Student(s1);//copy to yahapar ho gaya tha 
        s2.password = "Mahi@7781";
        s1.marks[2]=100;//yahape hamane s1.marks[2] ko change kiya to reflect hona chahiye ya nahi what do you think
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);

        System.out.println("marks");
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        // BankAccont bank1=new BankAccont("ranjane shubham", "lsdkfj");

        // System.out.println(bank1.username);
        // bank1.setPassward("Mahi@7781");
        // System.out.println(bank1.getPassward());

    }
}

class Student {

    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student() {
        System.out.println("constructor will be called ......");
    }

    // copy constructor shallow 
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //copy constructor deep
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        //to copy the marks will use the loop here to make the deep change here
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

}

class BankAccont {

    String username;
    private String passward;

    BankAccont(String username, String passward) {// parameterazed constructor
        this.username = username;
        this.passward = passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getPassward() {
        return this.passward;
    }
}