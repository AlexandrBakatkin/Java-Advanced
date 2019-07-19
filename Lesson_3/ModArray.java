import java.util.ArrayList;

public class ModArray {
    private ArrayList<String> modArray;

    public ModArray(ArrayList<String> modArray) {
        this.modArray = modArray;
    }

    public int checkWord(String element){
        int temp = 0;
        for (int i = 0; i < modArray.size(); i++) {
            if(element == modArray.get(i))
                temp++;
        }
        return temp;
    }

    public boolean isUnique(String element){
        if (checkWord(element) == 1){
            return true;
        } else return false;
    }

    public ArrayList<String> uniqueWords(){
        ArrayList<String> temp = new ArrayList<>();
        for (String s : modArray) {
            if (isUnique(s)){
                temp.add(s);
            }
        }
        return temp;
    }

    public ArrayList<String> howManyTimes() {
        ArrayList<String> temp = new ArrayList<>();
        for (String s : modArray) {
            if (isUnique(s)){
                temp.add(s + " - уникальное слово");
            } else {
                temp.add(s + " - кол-во повторений слова: " + checkWord(s));
            }
        }
        return temp;
    }

    public void howManyTimesBetter(){
        StringBuilder str = new StringBuilder();
        str.append("[");

        ArrayList<String> tempArr = new ArrayList<>();
        for (String s : modArray) {
            if(!tempArr.contains(s)){
                tempArr.add(s);
            }
        }

        for (String s : tempArr) {
            if(isUnique(s)){
                str.append(s + " - уникальное слово; ");
            } else {
                str.append(s + " - количество повторений: " + checkWord(s) + "; ");
            }
        }
        str.append("]");
        System.out.println(str);
    }

    public void printArray(){
        System.out.println(modArray);
    }
}