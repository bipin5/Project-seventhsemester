
package dao;

import View.AdminLogin;
import model.Admin;

public interface AdminDao {
    boolean addAdmin(Admin a);
    boolean deleteAdmin(int admin_id);
    boolean updateAdmin(Admin a);
    AdminLogin getbyid(int admin_id);
    
}
