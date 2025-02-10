class Heeey{
    static{
        System.out.println("This is an static block");
    }
    // creating static variables
    static String board;
    
    // creating static methods
    static void teaching(){
        System.out.println("TEACHER IS TEACHING IN THE " + board + " BOARD");
    }
}

public class StaticvariablesandobjectsEx {
    public static void main(String[] args){
        Heeey.board = "WHITE";
        Heeey.teaching();
    }
}
