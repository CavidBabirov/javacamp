import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.*;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};

        Category category = new Category(1,"Programming");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category);


        Course course = new Course(1,"Java",100);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course);

        Instructor instructor = new Instructor(1,"Engin","Demirog");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor);


    }
}
