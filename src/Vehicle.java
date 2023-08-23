public class Vehicle {
    //Methods
    // Create a fullThrottle() method
    public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
        }
    
    //Create method speed()
    public void speed(int spd){
        System.out.println("Speed is "+spd+"KmpH");
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args){
        Vehicle myCar = new Vehicle();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method        
    }
}
