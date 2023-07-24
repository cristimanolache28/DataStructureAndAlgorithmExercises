package love2code.exercises.output;

public class Exercise4 {
    public static void main(String[] args) {
        Person person = null;

        try {
            person.talk();
        } catch (NullPointerException e) {
            System.out.println("There is a NullPointerException.");
        } catch (Exception e) {
            System.out.println("There is an Exception");
        } finally {
            System.out.println("Everything was fine");
        }
    }
}

class Person {
    public void talk() {

    }
}
