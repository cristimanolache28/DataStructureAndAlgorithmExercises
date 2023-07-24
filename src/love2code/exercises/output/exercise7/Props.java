package love2code.exercises.output.exercise7;

public class Props {
    private static long delay;

    public Props () {
        delay = 1000;
    }

    public static long getDelay() {
        return delay;
    }

    public static void main(String[] args) {
        long delay1 = Props.getDelay();
        System.out.println("Delay1: " + delay1);
        Props props = new Props();
        long delay2 = Props.getDelay();
        System.out.println("Delay2: " + delay2);
    }
}
