package lesson_1;

public class Cat implements Running {
    @Override
    public void jumping() {
        System.out.print("Jump ");
    }

    @Override
    public void run() {
        System.out.print("Run ");
    }
}
