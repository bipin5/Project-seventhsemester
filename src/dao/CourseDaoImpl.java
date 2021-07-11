package dao;

import Db.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;

public class CourseDaoImpl implements CourseDao{

    Connection con = null;
	public CourseDaoImpl() {

		con = db.getdbcon();
	}
    @Override
    public boolean addCourse(Course c) {
        String sql = "insert into course(subject_code,subject,semester)values(?,?,?)";
        
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,c.getSubject_code());
            stm.setString(2,c.getSubject());
            stm.setString(3,c.getSemester());
            stm.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteCourse(int id) {
        String sql = "delete from course where id="+id;
        try {
            Statement stm = con.createStatement();
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
