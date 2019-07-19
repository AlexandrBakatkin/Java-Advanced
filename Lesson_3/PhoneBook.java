import java.util.HashMap;
import java.util.LinkedList;

public class PhoneBook {
    private HashMap<String, LinkedList> phoneBookMap;

    public PhoneBook() {
        HashMap<String, LinkedList> phoneBook = new HashMap<>();
        this.phoneBookMap = phoneBook;
    }

    public boolean add (String name, String number){
        if (phoneBookMap.get(name) == null){
            LinkedList<String> phoneNumbers = new LinkedList();
            phoneBookMap.put(name, phoneNumbers);
        }
        phoneBookMap.get(name).add(number);
        return true;
    }

    public String get (String name){
        return phoneBookMap.get(name).toString();
    }

    public void printPhoneBook (){
        System.out.println(phoneBookMap);
    }
}