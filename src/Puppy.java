public class Puppy {
    
    public Puppy(String name){
        // This constructor has one parameter, name
        int puppies = 10;
        System.out.println("Passed Name is :" +  name);
    }

    public static void main(String []args){
        //int puppies = 12;
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy("Tommy");
    }
}
