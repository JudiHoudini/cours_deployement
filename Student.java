/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Student {
    String firstName, lastName, school, standard;
    int rollNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String firstName, String lastName, String school, String standard, int rollNumber) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSchool(school);
        this.setStandard(standard);
        this.setRollNumber(rollNumber);
    }
    
    @Override
    public String toString() {
        return firstName+" "+lastName+" is a student of standard "+standard+" at "+school;
    }
}
