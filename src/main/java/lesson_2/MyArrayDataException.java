package lesson_2;

import java.io.PrintStream;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String error){
        System.out.println(error);
    }
}
