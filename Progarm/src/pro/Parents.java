package pro;

class Father {
    void Fath() {
        System.out.println("I'm a father");
    }

    class FirstChild {
        void introduce() {
            System.out.println("I'm the first child");
        }
    }

    class SecondChild {
        void introduce() {
            System.out.println("I'm the second child");
        }
    }
}

public class Parents {
    public static void main(String[] args) {
        Father father = new Father();
        Father.FirstChild firstChild = father.new FirstChild();
        Father.SecondChild secondChild = father.new SecondChild();

        father.Fath();
        firstChild.introduce();
        secondChild.introduce();
    }
}


