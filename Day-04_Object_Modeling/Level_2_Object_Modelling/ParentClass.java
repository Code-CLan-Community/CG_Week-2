// interface InterfaceA {
//     void display();
// }

// interface InterfaceB {
//     void display();
// }

// class ChildClass implements InterfaceA,InterfaceB {
//     // Resolve ambiguity by providing a single implementation
//     public void display() {
//         System.out.println("Display resolved in ChildClass");
//     }
// }

// // class ChildClass2 implements InterfaceB , InterfaceA{
// //     // Resolve ambiguity by providing a single implementation
// //     public void display() {
// //         System.out.println("Display resolved in ChildClass2");
// //     }
// // }
// public class ParentClass {

//     public static void main(String[] args) {
//         // ChildClass cc=new ChildClass();
//         // cc.display();
//         // ChildClass2 cc2=new ChildClass2();
//         // cc2.display();
//         InterfaceA cc = new ChildClass();
//         cc.display();
//     }
// }


interface InterfaceA {
     default public  void display() {
        System.out.println("Display from InterfaceA");
        
    }
}

interface InterfaceB {
     default public void display() {
        System.out.println("Display from InterfaceB");
    }
}

class ChildClass implements InterfaceA, InterfaceB {
    // Resolve ambiguity by overriding the method
    @Override
    public void display() {
        InterfaceA.super.display(); // Call InterfaceA's implementation
        System.out.println("Custom display from ChildClass");
        InterfaceB.super.display(); // Call InterfaceA's implementation
    }
}

public class ParentClass {

    public static void main(String[] args) {
        InterfaceA x = new ChildClass();
        InterfaceB y = new ChildClass();
        x.display();
        y.display();
    }
}