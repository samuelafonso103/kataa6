package kata6.toys;

import kata6.toyproducts.Toy;
import kata6.toyproducts.models.CarToy;
import kata6.toyproducts.models.HelicopterToy;

public class ToyBusiness {
    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator(); 
            
    public Toy createToy(String type){
        switch (type){
            case "car": 
                CarToy car = new CarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
        
        
            default:
                HelicopterToy helicopter = new HelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;               
        }           
    }
    

    public ToyBusiness() {
        
    }
}
