package pro;

public class MethodOops {

    int a = 11;

    void display() {
        System.out.println("welcome all");
    }

    public static void main(String[] args) {
        MethodOops car = new MethodOops();
        System.out.println(car.a);
        car.display();
    }
}
