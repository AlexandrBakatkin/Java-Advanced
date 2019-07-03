package Lesson_2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j) {
        super("Ошибка в ячейке [" + i + "]" + "[" + j + "]");
    }
}