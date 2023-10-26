package pro;

public class Multilevel {
    void grandee() {
        System.out.println("I'm grand father");
    }

    class Father {
        void father() {
            System.out.println("I'm father");
        }

        class Child {
            void ch() {
                System.out.println("I'm little brother");
            }
        }
    }

    public static void main(String[] args) {
        Multilevel multilevel = new Multilevel();
        Multilevel.Father father = multilevel.new Father();
        Multilevel.Father.Child child = father.new Child();

        father.father();
        multilevel.grandee();
        child.ch();
    }
}
