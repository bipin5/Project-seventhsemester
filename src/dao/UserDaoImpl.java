/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Db.db;
import View.TeacherLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Question;
import model.Teacher;

public class UserDaoImpl implements UserDao{
    Connection con = null;
    public UserDaoImpl(){
        
        con = db.getdbcon();
    }
    
    @Override
    public boolean addTeacher(Teacher t) {
        String sql = "insert into teacher(department,name,subject,email,userName,password,confirm)values(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(2,t.getName());
            stm.setString(1,t.getDepartment());
            stm.setString(3,t.getSubject());
            stm.setString(4,t.getEmail());
            stm.setString(5,t.getUserName());
            stm.setString(6,t.getPassword());
            stm.setString(7,t.getConfirm());
            
            stm.executeUpdate();
            return true;
           
        } catch (SQLException ex) {
            Logger.getLogger(QuestionPaperDaoimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    @Override
    public boolean deleteTeacher(int id) {
        String sql = "delete from teacher where id="+id;
        
        try {
            Statement stm = con.createStatement();
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public Teacher getbyid(int id) {
        String sql = "select * from teacher where id="+id;
        try {
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                Teacher t = new Teacher();
                
                rs.next();
                t.setId(rs.getInt("id"));
                t.setName(rs.getString("name"));
                t.setDepartment(rs.getString("department"));
                t.setSubject(rs.getString("subject"));
                t.setEmail(rs.getString("email"));
                t.setUserName(rs.getString("userName"));
                t.setPassword(rs.getString("password"));
                t.setConfirm(rs.getString("confirm"));
                return t;
                
        } catch (SQLException ex) {
                Logger.getLogger(QuestionPaperDaoimpl.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return null;
    }
    
    @Override
    public boolean updateTeacher(Teacher t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Teacher> getallTeacher() {
        List<Teacher> tlist = new ArrayList<>();
        String sql= "Select * from teacher";
        try{
          PreparedStatement stm= con.prepareStatement(sql);
            
            ResultSet rs= stm.executeQuery(sql);
            while(rs.next()){                
                
                Teacher t = new Teacher();
                t.setId(rs.getInt("id"));
                t.setName(rs.getString("name"));
                t.setDepartment(rs.getString("department"));
                t.setSubject(rs.getString("subject"));
                t.setEmail(rs.getString("email"));
                t.setUserName(rs.getString("userName"));
//                t.setPassword("password");
//                t.setConfirm(rs.getString("confirm"));
                
                tlist.add(t);
           }       
           // jTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        return tlist;
    }
    
}
