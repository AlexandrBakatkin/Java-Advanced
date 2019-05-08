package Lesson_2;

public class MySizeArrayException extends RuntimeException {
    public MySizeArrayException() {
        super("Массив иного размера, чем 4 х 4");
    }
}
