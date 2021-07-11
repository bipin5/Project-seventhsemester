package View;

import Db.db;
import dao.QuestionPaperDaoimpl;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Question;




public class AddQuestion extends javax.swing.JFrame {

    public AddQuestion() {
        initComponents();
        this.setTitle("Add Question");
        Toolkit toolkit= getToolkit();
        Dimension size= toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
             
        
        //populateData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLblcourse = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        difficultycmb = new javax.swing.JComboBox();
        semestercmb = new javax.swing.JComboBox();
        subjectcmb = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questiontxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        semestercmbset = new javax.swing.JComboBox();
        codeTxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(41, 144, 181));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5729893226_1fbdc19aca_n.jpg"))); // NOI18N
        jLabel1.setText("               Add Questions");

        jLblcourse.setText("Course");

        jLabel4.setText("Enter the Question");

        jLabel5.setText("Difficulty Level");

        jLabel7.setText("Semester");

        difficultycmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Hard ", "Medium ", "Easy", " " }));
        difficultycmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultycmbActionPerformed(evt);
            }
        });

        semestercmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8" }));
        semestercmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestercmbActionPerformed(evt);
            }
        });

        subjectcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectcmbActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyTyped(evt);
            }
        });

        questiontxt.setColumns(20);
        questiontxt.setRows(5);
        questiontxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                questiontxtKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(questiontxt);

        jLabel6.setText("Course Code");

        jLabel8.setText("Set");

        semestercmbset.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Set A", "Set B", "Set C" }));
        semestercmbset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestercmbsetActionPerformed(evt);
            }
        });

        codeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTxtActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(codeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(subjectcmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 302, Short.MAX_VALUE)
                        .addComponent(semestercmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(difficultycmb, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(semestercmbset, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestercmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblcourse)
                    .addComponent(subjectcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(difficultycmb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestercmbset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         TeacherLogin t= new TeacherLogin();
         t.setVisible(true);
         t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void difficultycmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultycmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_difficultycmbActionPerformed

    private void jScrollPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyTyped
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jScrollPane1KeyTyped

    private void questiontxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_questiontxtKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_questiontxtKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        Question q = new Question();
        //String id= id.get;        
        String ques = questiontxt.getText();
        String difflvl = difficultycmb.getSelectedItem().toString();
        String subject = subjectcmb.getSelectedItem().toString();
        String sem = semestercmb.getSelectedItem().toString();
        System.out.println("codetext"+codeTxt);
        String subjectcode = codeTxt.getText();
        System.out.println("subjectcode"+subjectcode);
        String sets= semestercmbset.getSelectedItem().toString();
        
                
        if (ques.isEmpty() || difflvl.isEmpty() || sem.isEmpty() ||subject.isEmpty() || subjectcode.isEmpty() ){
             JOptionPane.showMessageDialog(null,"no field should be empty!!!");
        }else{     
           // q.setId(id);
            q.setQuestion(ques);
            q.setDifficulty(difflvl);
            q.setSubject_name(subject);
            q.setSemester(sem);          
            
            q.setSubject_code(subjectcode);
            q.setSubject_set(sets);
            
            QuestionPaperDaoimpl qdao = new QuestionPaperDaoimpl();
            if(qdao.AddQuestion(q)){           

                JOptionPane.showMessageDialog(null,"Question added Successfully!!!");
                //populateData();


            }
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void semestercmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestercmbActionPerformed
        // TODO add your handling code here:
            subjectcmb.removeAllItems();
            Connection con = null;
            con = db.getdbcon();
            Statement stmt = null;

            try {
                stmt = con.createStatement();
                String semester = (String)semestercmb.getSelectedItem();
                String sql = "select * from course where semester = '" +semester +"'";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    String subject = rs.getString("subject");
                    //String subjectcode = rs.getString("subject_code");
                    subjectcmb.addItem(subject);
                    //codeTxt.setText(subjectcode);
                }

        } catch (SQLException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_semestercmbActionPerformed

    private void semestercmbsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestercmbsetActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_semestercmbsetActionPerformed

    private void subjectcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectcmbActionPerformed
//      
//        codeTxt.removeAll();
//        Connection con = null;
//        con = db.getdbcon();
//        Statement stmt = null;
//        
//        try {
//            stmt = con.createStatement();
//            String course = (String)subjectcmb.getSelectedItem();
//            String sql = "select * from course where subject_code = '" +course+"'";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                String coursecode = rs.getString("subject_code");
//                subjectcmb.addItem(coursecode);
//              }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
//        } 
    }//GEN-LAST:event_subjectcmbActionPerformed

    private void codeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTxtActionPerformed
       
           // subjectcmb.removeAllItems();
            Connection con = null;
            con = db.getdbcon();
            Statement stmt = null;

            try {
                stmt = con.createStatement();
                String subject = (String)subjectcmb.getSelectedItem();
                String sql = "select subject_code from course where subject = '" +subject +"'";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    //String subject = rs.getString("subject");
                    String subjectcode = rs.getString("subject_code");
                    System.out.println(subjectcode);
                    //subjectcmb.addItem(subject);
                    codeTxt.setText(subjectcode);
                }

        } catch (SQLException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }//GEN-LAST:event_codeTxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        semestercmb.setSelectedIndex(0);
        subjectcmb.setSelectedIndex(0);
        codeTxt.setText("");
        questiontxt.setText("");
        difficultycmb.setSelectedIndex(0);
        semestercmbset.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestion().setVisible(true);
                new AddQuestion().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeTxt;
    private javax.swing.JComboBox difficultycmb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblcourse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea questiontxt;
    private javax.swing.JComboBox semestercmb;
    private javax.swing.JComboBox semestercmbset;
    private javax.swing.JComboBox subjectcmb;
    // End of variables declaration//GEN-END:variables
}
