
package dao;

import View.AdminLogin;
import Db.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;

/**
 *
 * @author bipin
 */
public class AdminDaoImpl implements AdminDao{

    Connection con = null;
    public AdminDaoImpl(){
        
        con = db.getdbcon();
    }
    
    @Override
    public boolean deleteAdmin(int admin_id) {
       
        String sql = "delete from admin where id="+admin_id;
        try {
            Statement stm = con.createStatement();
            stm.execute(sql);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }


    @Override
    public AdminLogin getbyid(int admin_id) {
        String sql = "select * from admin where id="+admin_id;
            
        
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            AdminLogin a = new AdminLogin();
            
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean addAdmin(Admin a) {
        String sql = "insert into admin(fname,mname,lname,userName,password,confirm)values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1,a.getFname());
            stm.setString(2,a.getMname());
            stm.setString(3, a.getLname());
            stm.setString(4, a.getUserName());
            stm.setString(5, a.getPassword());
            stm.setString(6, a.getConfirm());
            stm.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    
    }

    @Override
    public boolean updateAdmin(Admin a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
