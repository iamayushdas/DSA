class Student{
    String name;
    int age;
    
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+ " " + age);
    }
}

// Jab same class me same name k functions hote hai with different arguements ya different return type
// to use hm ----> Function overloading ---- kehte h

public class compileTimePolymorphism {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ayush Das";
        s1.age = 22;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }

}
