public class BeforeAfterNotUniqeException extends Exception{
    public BeforeAfterNotUniqeException(String type){
        super(type + " - not unique");
    }
}