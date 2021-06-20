package objectclass;

class Test {
// first class
}

class Test1 {
// first class
}

class Test2 {
// second class
}

public class DetermineClass {
    public static void main(String[] args) {
        // create objects
        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();

        // get the class of the object obj1
        System.out.print("The class of obj1 is: ");
        System.out.println(obj1.getClass());

        // get the class of the object obj2
        System.out.print("The class of obj2 is: ");
        System.out.println(obj2.getClass());

        // check if obj is an object of Test
        if (obj1 instanceof Test1) {
            System.out.println("obj is an object of the Test class");
        } else {
            System.out.println("obj is not an object of the Test class");
        }

        // create an object
        Test obj = new Test();

        // check if obj is an object of Test1
        if (Test.class.isInstance(obj)) {
            System.out.println("obj is an object of the Test class");
        } else {
            System.out.println("obj is not an object of the Test class");
        }
    }

}
