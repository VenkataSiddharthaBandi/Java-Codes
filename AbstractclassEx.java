// Program to demonstrate Abstract Classes

abstract class CGovt{
    abstract void takeaction();
}

class APGovt extends CGovt{
    void takeaction(){
        System.out.println("Close only educational institutions");
    }
}

class TSGovt extends CGovt{
    void takeaction(){
        System.out.println("Close all educational institutions and offices");
    }
}

class MHGovt extends CGovt{
    void takeaction(){
        System.out.println("No need to close anything");
    }
}

public class AbstractclassEx{
    public static void main(String[] args){
        TSGovt obj1 = new TSGovt();
        obj1.takeaction();
        APGovt obj2 = new APGovt();
        obj2.takeaction();
        MHGovt obj3 = new MHGovt();
        obj3.takeaction();
    }
}