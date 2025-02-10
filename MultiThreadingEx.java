// Program to demonstrate Multi Threading in java

class MyThread extends Thread{
    String name;
    MyThread(String s){
        name = s;
    }
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println(name + " " + i);
        }
    }
}

public class MultiThreadingEx{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Main thread starts");
        System.out.println(t);
        System.out.println("Main thread starts");
        MyThread obj = new MyThread("First");
        Thread t1 = new Thread(obj);
        t1.setPriority(Thread.MAX_PRIORITY);
                    try{
            t1.join(100000);
            }
            catch(Exception e){}

        System.out.println(t1);
        t1.start();

        MyThread obj1 = new MyThread("Second");
        Thread t2 = new Thread(obj1);
        t2.setPriority(Thread.MIN_PRIORITY);
        try{
            t1.join(10000);
            }
            catch(Exception e){}
        System.out.println(t2);
        
        t2.start();
        
        System.out.println("Main thread ends");
    }
}
