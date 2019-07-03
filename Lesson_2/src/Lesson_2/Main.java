package Lesson_2;

public class Main {
    public static void main(String[] args) {

        String [][] strArr = new String [4][4];

        //Заполняем массив одинаковыми строковыми элементами для простоты

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                strArr[i][j] = "5";
            }
        }

        strArr[1][1] = "k";

        System.out.println("Сумма чисел в массиве: " + convertArray(strArr));

        //strArr[1][3] = "k";

        /*ArrayConvert arrayConvert = new ArrayConvert(strArr);
        System.out.println(arrayConvert.convertAndSum());*/
    }

    public static int convertArray (String [][] array){

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4){
                throw new MySizeArrayException();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}