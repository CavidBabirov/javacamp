package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao,Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {new Course(1,"Java",100),new Course(2,"C#",100)};
        for (Course courseName : courses) {
            if (courseName.equals(course.getName())) {
                throw new Exception("Kurs ismi tekrar edemez");
            }
            if (course.getPrice()<0) {
                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
            }
        }
        courseDao.add(course);

        for (Logger logger: loggers) {
            logger.log(course.getName());
        }
    }
}
