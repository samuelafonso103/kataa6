package kata6;

import java.util.Scanner;
import kata6.toyproducts.models.CarToy;
import kata6.toyproducts.models.HelicopterToy;
import kata6.toys.SerialNumberGenerator;
import kata6.toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
    
        while(true){
            System.out.println("Introduce command");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if (command.equals("car")){
                toyBusiness.createToy("car");
            }  else if (command.equals("helicopter")){
                toyBusiness.createToy("helicopter");
            } else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("program finished");
    
    }
    
    

    
}
