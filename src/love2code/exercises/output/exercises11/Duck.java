package love2code.exercises.output.exercises11;

public class Duck {
    private String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new Duck("Moby"));
    }
}
