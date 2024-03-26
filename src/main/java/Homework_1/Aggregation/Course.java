package Homework_1.Aggregation;

import java.util.ArrayList;

public class Course {
    private final ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    private final ArrayList<Textbook> textbooks = new ArrayList<Textbook>();
    private String name;

    public Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void printCourseInfo() {
        String info = String.format("Course Name: %s, ", name);
        info += getInstructorInfo() + ", ";
        info += getTextbookInfo();
        System.out.println(info);
    }

    private String getInstructorInfo() {
        String info = "Instructor: ";
        for (int i = 0; i < instructors.size(); i++) {
            Instructor currentInstructor = instructors.get(i);
            info += currentInstructor.getFirstName() + " " + currentInstructor.getLastName() + " Office Number: " + currentInstructor.getOfficeNumber();
            if (i < instructors.size() - 1) {
                info += ", ";
            }
        }
        return info;
    }

    private String getTextbookInfo() {
        String info = "Textbook: ";
        for (int i = 0; i < textbooks.size(); i++) {
            Textbook currentTextbook = textbooks.get(i);
            info += currentTextbook.getTitle() + " by " + currentTextbook.getAuthor() + ", Published by: " + currentTextbook.getPublisher();
            if (i < instructors.size() - 1) {
                info += ", ";
            }
        }
        return info;
    }
}

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor() {
    }

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

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
