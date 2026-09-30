package nested;

public class Car {
    private int noOfDoors;
    public void repair(){
        tier t=new tier();
    }

    public  class tier{
        private double price;
        private String material;
        private double width;
        void inflate(){
            noOfDoors=4;
        }
    }
}
// inner class can be static or non static
// inner class can also be protected or private
// we'll see some part in abstraction (anonymous classes)