/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603assignment2;

/**
 *
 * @author ellei
 */
public class Student {

    private String firstName;
    private String lastName;
    private String id;
    private String pathway;
    private String major;
    

    public Student(String firstName, String lastName, String id, String pathway, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.pathway = pathway;
        this.major = major;   
    }

    Student() {
        if (firstName.length() == 0){
            System.out.println("First name cannot be blank.");
        }
        else if (lastName.length() == 0){
            System.out.println("Last name cannot be blank.");
        }
        else{
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.pathway = pathway;
            this.major = major;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getPathway() {
        return pathway;
    }

    public String getMajor() {
        return major;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPathway(String pathway) {
        this.pathway = pathway;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return id + " " + firstName + " " + lastName + " " + pathway + " " + major;
    }   

//    @Override
//    public boolean equals(Object o){
//        Student student = (Student) o;
//        return (studentID == student.studentID);
//    } 
}
