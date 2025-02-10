class human{
    //instance variables
    String name;
    int age;
    //instance methods

    void talk(){
        System.out.println(name + " is talking");
    }
    void walk(){
        System.out.println(name + " is walking");
    }
}
    
    //driver class
public class  Classandobj{
    public static void main(String[] args){
        //creating objects
        human Siddhartha = new human();
        //asigning variables to Siddhartha class\
        Siddhartha.name = "Bandi Venkata Siddhartha";
        Siddhartha.age = 19;
        //assigning mehods to Siddhartha class
        Siddhartha.talk();
        Siddhartha.walk();
    
}
}

