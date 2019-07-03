import java.util.ArrayList;

public class CustomQuery {

    private ArrayList <Object> query = new ArrayList<>();

    public CustomQuery(){
        query.add("1");
        query.add("2");
        query.add("3");
        query.add("4");
        query.add("5");
        query.add("6");
        query.add("7");
        query.add(new Integer(10));
        query.add(new Integer(10));
    }

    public void putElement(Object object){
        query.add(object);
    }

    public Object getElement(){
        if (query.isEmpty()){
            return null;
        }
        return query.remove(0);
    }
}