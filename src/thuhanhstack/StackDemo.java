package thuhanhstack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void Show(){
        Stack<Integer> student = new Stack<>();
        student.push(1);
        student.push(2);
        student.push(3);
        student.push(4);
        System.out.println(student);
        final int x  = student.size();
    Stack<Integer> reverseStudent  = new Stack<>();
        for (int i = 0; i <x ; i++) {
            reverseStudent.push(student.pop());
        }
        System.out.println(reverseStudent);





    }

}
