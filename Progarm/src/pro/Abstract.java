package pro;

abstract class Goa {
    abstract void vocation();
}

abstract class Tour extends Goa {
    void vocation() {
        System.out.println("Hello all");
    }

    abstract void ooty();
}

public class Abstract {
    public static void main(String[] args) {
        Tour ab = new Tour() {
            @Override
            void ooty() {
                System.out.println("Going to Ooty for a trip");
            }
        };

        ab.vocation();
        ab.ooty();
    }
}

