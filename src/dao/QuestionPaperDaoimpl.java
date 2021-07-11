/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import Db.db;
import View.AddQuestion;
import View.AddUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Question;
import model.Teacher;
import model.User;

/**
 *
 * @author Mingmar Hyolmo
 */
public class QuestionPaperDaoimpl implements QuestionPaperDao{

    Connection con = null;
    public QuestionPaperDaoimpl(){
        con = db.getdbcon();
    }    
    
    @Override
    public List<Question> getallQuestion() {
        List<Question> qlist= new ArrayList<>();
        String sql= "Select * from questionpaper";
        try{
          PreparedStatement stm= con.prepareStatement(sql);
            
            ResultSet rs= stm.executeQuery(sql);
            while(rs.next()){                
                
                Question q= new Question();
                q.setId(rs.getInt("id"));
                q.setQuestion(rs.getString("question"));
                q.setDifficulty(rs.getString("difficulty"));
                q.setSubject_name(rs.getString("subject_name"));
                q.setSemester(rs.getString("semester"));
                q.setSubject_code(rs.getString("subject_code"));
                q.setSubject_set(rs.getString("subject_set"));
                
                qlist.add(q);
           }       
           // jTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
       return qlist; 
    }

    @Override
    public boolean AddQuestion(Question a) {
        String sql = "insert into questionpaper(question,difficulty,subject_name,semester,subject_code,subject_set)values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,a.getQuestion());
            stm.setString(2,a.getDifficulty() );
            stm.setString(3,a.getSubject_name());
            stm.setString(4,a.getSemester());
            stm.setString(5,a.getSubject_code());
            stm.setString(6,a.getSubject_set());
            
            stm.execute();
            return true;
            
        }catch(SQLException ex) {
            Logger.getLogger(QuestionPaperDaoimpl.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }

    @Override
    public boolean DeleteQuestion(int id) {
        String sql = "delete from questionpaper where id= "+id;
        
        try {
            Statement stm = con.createStatement();
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuestionPaperDaoimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//    @Override
//    public View.AddUser getbyUser(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Question getbyid(int id) {
    String sql = "select * from questionpaper where id="+id;
    
        try {
            Statement stm =con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            Question q = new Question();
            rs.next();
            q.setId(rs.getInt("id"));
            q.setQuestion(rs.getString("question"));
            q.setDifficulty(rs.getString("difficulty"));
            q.setSubject_name(rs.getString("subject_name"));
            q.setSubject_code(rs.getString("subject_code"));
            q.setSemester(rs.getString("semester"));
            q.setSubject_set(rs.getString("subject_set"));
            return q;
        } catch (SQLException ex) {
            Logger.getLogger(QuestionPaperDaoimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return null;
    }


    

     
}