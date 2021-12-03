package kata6.toyproducts.models;

import kata6.toyproducts.Toy;

public class CarToy implements Toy{
    private final Integer serialNumber;

    public CarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public  void pack(){
        System.out.println("The car with serial number " + serialNumber + " is packed\n");
    }
    
    @Override
    public void label(){
        System.out.println("The car with serial number " + serialNumber + " is labeled\n");
    }
}
