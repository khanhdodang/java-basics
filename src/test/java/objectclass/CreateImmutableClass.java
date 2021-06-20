package objectclass;

// class is declared final
final class Immutable {

    // private class members
    private String name;
    private int date;

    Immutable(String name, int date) {

        // class members are initialized using constructor
        this.name = name;
        this.date = date;
    }

    // getter method returns the copy of class members
    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

}

public class CreateImmutableClass {
    public static void main(String[] args) {

        // create object of Immutable
        Immutable obj = new Immutable("Programiz", 2011);

        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());
    }
}

/*
Java Immutable Class
In Java, when we create an object of an immutable class, we cannot change its value. For example, String is an immutable class. Hence, we cannot change the content of a string once created.

Besides, we can also create our own custom immutable classes. Here's what we need to do to create an immutable class.

declare the class as final so it cannot be extended
all class members should be private so they cannot be accessed outside of class
shouldn't contain any setter methods to change the value of class members
the getter method should return the copy of class members
class members are only initialized using constructor
 */