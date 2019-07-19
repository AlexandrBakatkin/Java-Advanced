package Lesson_2;

public class ArrayConvert {

    private String [][] strArray;

    public ArrayConvert(String[][] strArray) {
        this.strArray = strArray;

        for (int i = 0; i < 4; i++) {
            if (strArray.length != 4 || strArray[i].length != 4){
                throw new MySizeArrayException();
            }
        }
    }

    public int convertAndSum (){
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum = sum + Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}