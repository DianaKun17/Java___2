package lesson_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String error){
        System.out.println(error);
    }
}
