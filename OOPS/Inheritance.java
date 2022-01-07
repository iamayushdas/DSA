// ek class k property jb doosri class lena chahti h use hm kehte h inheritance

                                        // Single-level inheritance
// class Shape {
//     public void area(){
//         System.out.println("Display area");
//     }
// }
// class Triangle extends Shape {
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

                                            // Multilevel inheritance

// class Shape {
//     public void area(){
//         System.out.println("Display area");
//     }
// }
// class Triangle extends Shape {
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

                                    // Hierarchial Inheritance
class Shape {
    String color;
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}



public class Inheritance {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.area(10);
        c1.color = "red";
        System.out.println(c1.color);
    }
}
