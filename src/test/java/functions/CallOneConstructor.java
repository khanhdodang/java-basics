package functions;

public class CallOneConstructor {
    int sum;

    // first constructor
    CallOneConstructor() {
        // calling the second constructor
        this(5, 2);
    }

    // second constructor
    CallOneConstructor(int arg1, int arg2) {
        // add two value
        this.sum = arg1 + arg2;
    }

    void display() {
        System.out.println("Sum is: " + sum);
    }

    // main class
    public static void main(String[] args) {

        // call the first constructor
        CallOneConstructor obj = new CallOneConstructor();

        // call display method
        obj.display();
    }
}
