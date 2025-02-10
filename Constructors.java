    class hey{
    String channel;
    hey(){
    channel = "twg";
    }
    hey(String channel){
        this.channel = channel;
    }

}

public class Constructors {
    public static void main(String[] args){
        hey obj = new hey();
        System.out.println("channel name is " + obj.channel);
        hey channel = new hey (" TELUGU WEB GURU ");
        System.out.println("channel name is " + channel.channel);
    }
}