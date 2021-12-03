package kata6.toys;

public class Car {
    private final Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public  void pack(){
        System.out.println("The car with serial number " + serialNumber + " is packed\n");
    }
    
    public void label(){
        System.out.println("The car with serial number " + serialNumber + " is labeled\n");
    }
}
