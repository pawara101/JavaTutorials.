public class App3 {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");   
}
  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  //Main Method
  public static void main(String[] args){
    myStaticMethod();// Call static method

    App3 myApp3 = new App3();
    myApp3.myPublicMethod();
  }
}
