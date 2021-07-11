
package dao;

import View.TeacherLogin;
import java.util.List;
import model.Teacher;


public interface UserDao {
    boolean addTeacher(Teacher t);
    boolean deleteTeacher(int id);
    boolean updateTeacher(Teacher t);
    Teacher getbyid(int id);
    List<Teacher> getallTeacher();
}
