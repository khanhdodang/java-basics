package functions;

public class CalculateExecutionTime {
    // create a method
    public void display() {
        System.out.println("Calculating Method execution time:");
    }

    // main method
    public static void main(String[] args) {

        // create an object of the Main class
        CalculateExecutionTime obj = new CalculateExecutionTime();

        // get the start time
        long start = System.nanoTime();

        // call the method
        obj.display();

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}

/*
Output

Calculating Method execution time:
Execution time: 656100 nanoseconds
In the above example, we have created a method named display(). The method prints a statement to the console. The program calculates the execution time of the method display().

Here, we have used the method nanoTime() of the System class. The nanoTime() method returns the current value of the running JVM in nanoseconds.


 */
