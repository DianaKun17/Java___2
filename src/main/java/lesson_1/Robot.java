package lesson_1;

public class Robot implements Running {
    @Override
    public void jumping() {
        System.out.print("Jump ");
    }

    @Override
    public void run() {
        System.out.print("Run ");
    }
}
