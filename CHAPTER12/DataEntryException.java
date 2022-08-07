package CHAPTER12;

public class DataEntryException extends Exception {

    public DataEntryException(int data) {
        super("DataEntryException - " +data);
    }
}
