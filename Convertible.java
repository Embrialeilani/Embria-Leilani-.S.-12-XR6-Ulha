public class Convertible extends Bicycle {
    //Object Class
    String roofType;
    public int numDoors;
    public boolean isElectric;

    public Convertible() {
        super();
        roofType = " ";
    }


    public Convertible (int numWheels, double price, int numDoors,boolean isElectric, String roofType) {
      this.roofType = roofType;
    }

    public String getroofType() {
        return this.roofType;
    }

    public void setroofType(String roofType) {
        this.roofType= roofType;
    } 

    public void print() {
        super.print();
        System.out.println("roofType : " + roofType);
    }


}
