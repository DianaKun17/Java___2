package lesson_1;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human();
        Cat c1 = new Cat();
        Robot r1 = new Robot();
        Human h2 = new Human();
        Cat c2 = new Cat();

        RunningTrack let1 = new RunningTrack();
        Wall let2 = new Wall();
        Wall let3 = new Wall();
        RunningTrack let4 = new RunningTrack();
        RunningTrack let5 = new RunningTrack();

        Let[] lets = {let1, let2, let3, let4, let5};
        Running[] running = {h1, h2, c1, c2, r1};

        for (int j = 0; j < running.length; j++) {
            for (int i = 0; i < lets.length; i++) {
                if (lets[i] instanceof Wall) {
                    running[j].jumping();
                } else {
                    running[j].run();
                }
            }
            System.out.println();
        }
    }
}
