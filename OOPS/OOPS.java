class Pen{
    String color;
    String type;

    public void writing(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    // parameterised constructor

    Pen(String color, String type){
        System.out.println("parametrised constructor called");
        this.color = color;
        this.type = type;
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non parametrised constructor
    Student(){
        System.out.println("non parametrised constructor called");
    }
}

class Vehicle{
    String name;
    String brand;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.brand);
    }

    // copy constructor
    Vehicle(Vehicle v2){
        this.name = v2.name;
        this.brand = v2.brand;
    }

    Vehicle(){

    }
}

public class OOPS{
    public static void main(String[] args){
        Pen pen1 = new Pen("blue", "ballpoint");
        pen1.writing();
        pen1.printColor();

        Pen pen2 = new Pen("black", "gel");
        pen2.writing();
        pen2.printColor();


        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 22;

        s1.printInfo();

        Student s2 = new Student();
        s2.name = "Shivani";
        s2.age = 23;

        s2.printInfo();


        Vehicle v1 = new Vehicle();
        v1.name = "Car";
        v1.brand = "Porche";

        Vehicle v2 = new Vehicle(v1);
        v2.printInfo();

    }
}
