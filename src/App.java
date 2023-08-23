public class App {
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    // }
    // Create a method
    static void myMethod(){
        System.out.println("-------Method 01");
    }
    final int z = 290; //cannot change

    int x =10;
    int y = 3;
    // Create object myObj
    public static void main(String[] args){
        App myObj1 = new App();
        System.out.println("Before modify "+myObj1.x);

        // Modify the x
        myObj1.x = 25;
        System.out.println("After modify "+myObj1.x);

        // call the method
        myMethod();    
    }


}

