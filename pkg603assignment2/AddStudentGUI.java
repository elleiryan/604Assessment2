/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg603assignment2;

/**
 *
 * @author ellei
 */
import com.sun.istack.internal.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class AddStudentGUI extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public static String url="jdbc:derby://localhost:1527/pdcfinal;create=true";
    public static String username = "pdc";
    public static String password = "pdc";
    /**
     * Creates new form NewJFrame
     * @throws java.lang.ClassNotFoundException
     */
    public AddStudentGUI() throws ClassNotFoundException {
        initComponents();
        show_user();

    }

public ArrayList<Student> studentList() throws ClassNotFoundException{
    ArrayList<Student> studentList = new ArrayList<>();
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/pdc;create=true";
        conn = DriverManager.getConnection(url);
        String query = "SELECT * FROM STUDENT";
        Statement st = conn.createStatement();
        rs = st.executeQuery(query);
        Student stu;
        while(rs.next()){
            stu = new Student(rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("STUDENTID"),rs.getString("PATHWAY"), rs.getString("MAJOR"));
            studentList.add(stu);
        }
    }catch (SQLException ex){
    JOptionPane.showMessageDialog(null, ex);
    }
return studentList;
}

public void show_user() throws ClassNotFoundException{
    ArrayList<Student> list = studentList();
    DefaultTableModel model = (DefaultTableModel)TableStudent.getModel();
    Object[] row = new Object[5];
    for (int i = 0; i <list.size(); i++)
    {
        row[0] = list.get(i).getId();
        row[1] = list.get(i).getFirstName();
        row[2] = list.get(i).getLastName();
        row[3] = list.get(i).getPathway();
        row[4] = list.get(i).getMajor();
        model.addRow(row);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableStudent = new javax.swing.JTable();
        idLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        fnameLabel = new javax.swing.JLabel();
        fnameText = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameText = new javax.swing.JTextField();
        pathwayLabel = new javax.swing.JLabel();
        majorLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        pathwayCombo = new javax.swing.JComboBox<>();
        majorCombo = new javax.swing.JComboBox<>();
        resetButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First name", "Last name", "Pathway", "Major"
            }
        ));
        jScrollPane1.setViewportView(TableStudent);

        idLabel.setText("Student ID:");

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        fnameLabel.setText("First Name:");

        lnameLabel.setText("Last Name:");

        lnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTextActionPerformed(evt);
            }
        });

        pathwayLabel.setText("Pathway:");

        majorLabel.setText("Major");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        pathwayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCIS", "BBUS", "BA" }));

        majorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software Development", "Artificial Intelligence", "Networking & Security", "Information Systems", "Marketing", "Finance", "Accounting", "Economics", "Creative Writing", "Japanese", "Korean", "International Studies", "Psychology", " " }));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        homeButton.setText("Return to Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fnameText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnameLabel)
                            .addComponent(majorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pathwayLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lnameText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(majorCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pathwayCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(20, 20, 20)
                        .addComponent(idText))
                    .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameLabel)
                            .addComponent(fnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnameLabel)
                            .addComponent(lnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pathwayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pathwayLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(majorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(majorLabel))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetButton)
                            .addComponent(addButton))
                        .addGap(93, 93, 93))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(homeButton)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/pdc;create=true";
            conn = DriverManager.getConnection(url);
            String query = "INSERT INTO STUDENT (FIRSTNAME, LASTNAME, STUDENTID, PATHWAY, MAJOR)VALUES(?,?,?,?,?)";
            pst = conn.prepareStatement(query);

            pst.setString(1, idText.getText());
            pst.setString(2, fnameText.getText());
            pst.setString(3, lnameText.getText());
            String pathway;
            pathway = pathwayCombo.getSelectedItem().toString();
            pst.setString(4, pathway);
            String major; 
            major = majorCombo.getSelectedItem().toString();
            pst.setString(5, major);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student Information Added");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void lnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTextActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        idText.setText("");
        fnameText.setText("");
        lnameText.setText("");
        fnameText.setText("");
        pathwayCombo.setSelectedIndex(0);
        majorCombo.setSelectedIndex(0);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        MenuGUI window = new MenuGUI();
        window.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new AddStudentGUI().setVisible(true);
                } catch (ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableStudent;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField fnameText;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField lnameText;
    private javax.swing.JComboBox<String> majorCombo;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JComboBox<String> pathwayCombo;
    private javax.swing.JLabel pathwayLabel;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
