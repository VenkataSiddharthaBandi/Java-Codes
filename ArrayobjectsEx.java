// Program to demonstrate Array objects in java

class Student{
    String name;
    int age;
    Student(String s,int i){
        name = s;
        age = i;
    }
}

public class ArrayobjectsEx{
    public static void main(String[] args){
        Student s1 = new Student("Siddhartha",19);
        Student s2 = new Student("Ajay",19);
        Student s3 = new Student("Lokesh",20);
        Student Students[] = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for(int i=0;i<Students.length;i++){
        
            System.out.println(Students[i].name+","+Students[i].age);
        }
    }
}