// Program to demonstrate Array Methods using Util package

import java.util.*;

public class ArrayMethodsEx{
    public static void main(String[] args){
        int marks[] = {34,23,45,43,32};
        int marks2[] = {34,23,45,43,32};
        
        System.out.print("Before Sorting the array : ");
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i] + "\t");
        }

        Arrays.sort(marks);
        System.out.print("\n After Sorting the array : ");
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i] + "\t");
        }
        
        System.out.println("\nThe index of 43 is : " + Arrays.binarySearch(marks,43));
        System.out.println("Comparing marks and marks2 array whether they are equal : " + Arrays.equals(marks,marks2));
    }
}