package love2code.exercises.output;

public class Exercise2 {
    public static void main(String[] args) {
        String message = "Hello World!";
        String newMessage = message.substring(6, 12) + " " + message.substring(2, 4);
        System.out.println(newMessage);


        //---Wrong---
     /*   String message = "Hello World!";
        String newMessage = message.substring(6, 12) + " " + message.substring(6, 12);
        System.out.println(newMessage);*/

        //---wrong---
        /*int a = 123451234512345;
        System.out.println(a);*/
    }
}
