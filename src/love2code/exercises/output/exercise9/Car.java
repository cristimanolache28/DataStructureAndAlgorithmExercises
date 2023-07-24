package love2code.exercises.output.exercise9;

public class Car {
    String color = "blue";

}

class Lombo extends Car {
    String color = "white";

    Lombo() {
        System.out.println(super.color);
        System.out.println(this.color);
        System.out.println(color);
    }

    public void print(){
        System.out.println(super.color);
        System.out.println(this.color);
        System.out.println(color);
    }

    public static void main(String[] args) {
        Lombo lombo =  new Lombo();
        lombo.print();
    }
}

