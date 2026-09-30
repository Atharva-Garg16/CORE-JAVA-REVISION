package Library;

public class libraryItem {
    private int itemID;
    private String title;
    private String author;
    public void checkOut(){
        System.out.println("Checking out");
    }
    void returnItem(){
        System.out.println("Returning the item");
    }
}

