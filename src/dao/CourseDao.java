
package dao;

import model.Course;

public interface CourseDao {
    boolean addCourse(Course c);
    boolean deleteCourse(int id);
}
