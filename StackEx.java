import java.util.*;

public class StackEx{
    public static void main(String[] args){
        Stack<Integer> marks = new Stack<Integer>();
        marks.push(90);
        marks.push(80);
        marks.push(70);
        
        if(marks.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The size of stack is: " + marks.size());
        }

        System.out.println("The first element of stack is: " + marks.peek());
        marks.push(75);
        System.out.println("After adding an new element into the stack the first element is: " + marks.peek());
        System.out.println("Removing first element from the stack: " + marks.pop());
        System.out.println("After removing the top element from the stack: " + marks.peek());
    }
}