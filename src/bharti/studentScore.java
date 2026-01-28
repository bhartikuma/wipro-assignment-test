/* Use Case 2: Student Score Processing System
📝 Problem Statement
Create a Java program named StudentScore.java that:
Accepts 3 command-line arguments:
Student Name (String)
Marks in English (int)
Marks in Maths (int)
 
Example:
java StudentScore Renu 78 92
Inside the program:
Calculate total and percentage using arithmetic operators.
Use comparison operators to determine grade:
≥ 90 → A
≥ 75 → B
≥ 50 → C
< 50 → Fail
Store student details in an object:
•  → practice Garbage Collection concept.
•  Use a switch keyword for grade calculation (optional).
Output
Student: Renu
English: 78
Maths: 92
Total: 170
Percentage: 85.0%
Grade: B*/
package bharti;

import java.util.Scanner;

public class studentScore {
	 
	public static void main(String[] args) {
	String name=args[0];
        int Eng=Integer.parseInt(args[1]);
        int Maths=Integer.parseInt(args[2]);
 
        int Total=Eng+Maths;
        float Per=Total/2.0f;
 
        char grade;
 
        if(Per>=90)
            grade='A';
        else if(Per>=75)
            grade='B';
        else if(Per>=50)
            grade='C';
        else
            grade='F';
 
        System.out.println("Student: "+name);
        System.out.println("English: "+Eng);
        System.out.println("Maths: "+Maths);
        System.out.println("Total: "+Total);
        System.out.println("Percentage: "+Per+ "%");
        System.out.println("Grade: "+grade);
 
        Student S=new Student();
        S=null;
    }
}
 
class Student {
	}
 