//  Program to demonstrate Multi Threading Synchronization in java

// class TicketBooking{
//     public synchronized void BookTicket(String name){
//         boolean booked = false;
//         if(booked == false){
//         System.out.println(name + " Selected the ticket");
//         System.out.println(name + " Completed the payment");
//         System.out.println(name + " Got the ticket");
//         booked = true;
//         }
//         else{
//             System.out.println("Sorry + "  + "name + this ticket is already booked");
//         }
//     }
// }

// class myThread extends Thread{
//     String name;
//     TicketBooking tb;
//     myThread(TicketBooking obj,String n){
//         tb = obj;
//         name = n;
//     }
//     public void run(){
//         tb.BookTicket(name);
//     }
// }

// public class MultiThreadingSynchronizationEx {
//     public static void main(String[] args){
//       TicketBooking tb = new TicketBooking();
//       MyThread mt1 = new MyThread(tb,"Siddhartha");
//       Thread t = new Thread(mt1);
//       t.start();
//         try{
//        t.join(1000);
//         }
//         catch(Exception e){}

//        MyThread mt2 = new MyThread(tb,"Chetan");
//         Thread t2 = new Thread(mt2);
//        t2.start();

//     }
// }
