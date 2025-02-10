/*Inheritance example program
 This  program is also an example for single inheritance */


// Class A is parent class of class B
class h{
    String bookname;
    String authorname;
}

// Class B is sub class of A
class s extends h{
    int cost;
    void bookdetails(){
        System.err.println("Book name is " + bookname + " author name is " + authorname + " and its cost is " + cost);
    }
}

public class InheritanceEx{
    public static void main(String[] args){
        s obj = new s();
        obj.bookname = "Wings of Fire";
        obj.authorname = "Dr.APJ.Abdul Kalam";
        obj.cost = 800;
        obj.bookdetails();
    }
}
