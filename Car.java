public class Car extends Vehicle {
    //Object Class
    int numDoors;
    boolean isElectric;
    public int discount;

    public Car () {
        super();
        numDoors = 0;
        isElectric = false ;
    }

    public Car(int numDoors,boolean  isElectric, double price, int numWheels) {
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getnumDooors() {
        return this.numDoors;
    }
    
    public void setnumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
    public boolean getisElectric() {  
        return this.isElectric;
    }
    
    public void setisElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void print() {
        super.print();
        System.out.println("numDoors : " + numDoors);
        System.out.println("isElectric : " + isElectric);
        double hargakhir = price-price*discount/100;
        System.out.println("Harga Akhir : " + hargakhir);

    }
}
