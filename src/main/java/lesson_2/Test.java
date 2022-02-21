package lesson_2;

public class Test {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"}};

        try {
          testOne(array);
        } catch (MyArraySizeException e){
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }

    public static void testOne(String[][] array) {
        int sum = 0;

        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException y){
                    throw new MyArrayDataException("Некорректный элемент по индексу [" + i +"][" + j +"]");
                }
            }
        }

        System.out.println(sum);
    }
}

