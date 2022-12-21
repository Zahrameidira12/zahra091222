/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra091222;

/**
 *
 * @author HP
 */
public class polimorfisExample {
    public static void main(String[] args){
    person ref;
    student Student = new student ();
    employee Employee = new employee();
    ref = Student;
    String temp = ref.getName();
    System.out.println("     "+temp);
    
    ref = Employee;
    String temp1 = ref.getName();
    System.out.println("     "+temp1);
    }
}
