package love2code.exercises.output.exercise6;

public class Test {
    public void dolt(int i, Person p) {
        i = 5;
        p.number = 8;
    }

    public static void main(String[] args) {
        int x = 0;
        Person p = new Person();
        new Test().dolt(x, p);
        System.out.println(x + " " + p.number);
    }
}

class Person {
    public int number;
}
