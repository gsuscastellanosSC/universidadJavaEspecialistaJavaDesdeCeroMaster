/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

/**
 *
 * @author sc
 */
public class Class {

    public static void main(String args[]) {
        Person personOne = new Person();
        personOne.name = "Juan";
        personOne.lastName = "Perez";
        personOne.gender = "Male";
        personOne.occupation = "Engineer";
        personOne.dataPerson();
        
        Person personTwo = new Person();
        personTwo.name = "Jesus";
        personTwo.lastName = "Castellanos";
        personTwo.gender = "Male";
        personTwo.occupation = "Engineer";
        personTwo.dataPerson();
    }

    public static class Person {

        String name;
        String lastName;
        String gender;
        String occupation;

        public void dataPerson() {
            System.out.println("\n");
            System.out.println("Name: " + name);
            System.out.println("Last name: " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("Occupation: " + occupation);
        }

    }
}
