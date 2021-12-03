
package kata6.toys;


public class Helicopter {
    private final Integer serialNumber;

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public  void pack(){
        System.out.println("The Helicopter with serial number " + serialNumber + " is packed\n");
    }
    
    public void label(){
        System.out.println("The Helicopter with serial number " + serialNumber + " is labeled\n");
    } 
}
