package lesson_1;

import org.w3c.dom.ls.LSOutput;

public class Human implements Running {

    @Override
    public void jumping() {
        System.out.print("Jump ");
    }

    @Override
    public void run() {
        System.out.print("Run ");
    }
}
