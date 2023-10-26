package pro;

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display();
        System.out.println("Child class");
    }
}

public class MethodOverride {
    public static void main(String args[]) {
        Child myObj = new Child();
        myObj.display();
    }
}
