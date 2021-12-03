package kata6;

import java.util.Scanner;
import kata6.toys.Car;
import kata6.toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
        while(true){
            System.out.println("Introduce command");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if (command.equals("car")){
                Car car = new Car(serialNumberGenerator.next());
                car.pack();
                car.label();
            } else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("program finished");
    
    }
    
    

    
}
