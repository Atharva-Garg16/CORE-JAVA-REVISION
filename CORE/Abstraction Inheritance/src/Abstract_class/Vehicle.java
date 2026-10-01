package Abstract_class;

public abstract class  Vehicle {
    int noOfTire;

    public int getNoOfTire() {
        return noOfTire;
    }

    public void setNoOfTire(int noOfTire) {
        this.noOfTire = noOfTire;
    }

    public Vehicle(int noOfTire) {
        this.noOfTire = noOfTire;
    }
    public void commute(){
        System.out.println("going");
    }
}
