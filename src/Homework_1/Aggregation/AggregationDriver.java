package Homework_1.Aggregation;

import org.w3c.dom.Text;

public class AggregationDriver {
    public static void main(String[] args){
        Course softwareEngineeringCourse = new Course();
        softwareEngineeringCourse.setName("Software Engineering");
        Instructor nima = new Instructor();
        nima.setFirstName("Nima");
        nima.setLastName("Davarpanah");
        nima.setOfficeNumber("3-2636");
        softwareEngineeringCourse.addInstructor(nima);
        Textbook cleanCode = new Textbook();
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor("Robert C. Martin");
        cleanCode.setPublisher("Prentice Hall");
        softwareEngineeringCourse.addTextbook(cleanCode);
        softwareEngineeringCourse.printCourseInfo();

        Instructor kayaba = new Instructor();
        kayaba.setFirstName("Kayaba");
        kayaba.setLastName("Akihiko");
        kayaba.setOfficeNumber("0");
        softwareEngineeringCourse.addInstructor(kayaba);

        Textbook sao = new Textbook();
        sao.setTitle("Sword Art Online");
        sao.setAuthor("川原 礫");
        sao.setPublisher("ASCII Media Works");
        softwareEngineeringCourse.addTextbook(sao);

        softwareEngineeringCourse.printCourseInfo();

    }
}
