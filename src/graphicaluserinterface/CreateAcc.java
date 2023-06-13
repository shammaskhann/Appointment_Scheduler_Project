package graphicaluserinterface;
import appointmentschedular.Patient;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author Shammas PC
 */
public class CreateAcc extends javax.swing.JFrame {
    
    public CreateAcc() 
    {
        initComponents();
        txtContactNo.setText("92");
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCreateNewPatientAccount = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPatientMedicalHistory = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblSelectGender = new javax.swing.JLabel();
        cmbSelectGender = new javax.swing.JComboBox<>();
        btnCreateNewAccount = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMedicalHistory = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));

        jPanel1.setLayout(null);

        lblCreateNewPatientAccount.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        lblCreateNewPatientAccount.setText("Create New Patient Account");
        jPanel1.add(lblCreateNewPatientAccount);
        lblCreateNewPatientAccount.setBounds(480, 30, 650, 62);

        lblUsername.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Enter UserName");
        jPanel1.add(lblUsername);
        lblUsername.setBounds(180, 140, 220, 32);

        lblPatientName.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setText("Enter Patient Name");
        jPanel1.add(lblPatientName);
        lblPatientName.setBounds(180, 210, 260, 32);

        lblEmail.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Enter Email");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(180, 390, 170, 32);

        lblPatientMedicalHistory.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblPatientMedicalHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientMedicalHistory.setText("Enter Patient Medical History");
        jPanel1.add(lblPatientMedicalHistory);
        lblPatientMedicalHistory.setBounds(871, 236, 331, 32);

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientName);
        txtPatientName.setBounds(502, 204, 302, 44);

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtContactNo);
        txtContactNo.setBounds(502, 453, 313, 44);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(502, 375, 313, 44);

        lblContactNo.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(255, 255, 255));
        lblContactNo.setText("Enter Contact No");
        jPanel1.add(lblContactNo);
        lblContactNo.setBounds(180, 470, 220, 32);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername);
        txtUsername.setBounds(502, 124, 302, 44);

        lblPassword.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Enter Password");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(180, 540, 210, 32);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(502, 532, 313, 45);

        lblSelectGender.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblSelectGender.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectGender.setText("Select Gender");
        jPanel1.add(lblSelectGender);
        lblSelectGender.setBounds(180, 310, 200, 32);

        cmbSelectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Gender-", "Male", "Female" }));
        cmbSelectGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectGenderActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSelectGender);
        cmbSelectGender.setBounds(502, 298, 302, 45);

        btnCreateNewAccount.setBackground(new java.awt.Color(0, 51, 102));
        btnCreateNewAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreateNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNewAccount.setText("Create New Account");
        btnCreateNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateNewAccount);
        btnCreateNewAccount.setBounds(630, 690, 340, 45);

        txtareaMedicalHistory.setColumns(20);
        txtareaMedicalHistory.setRows(5);
        jScrollPane1.setViewportView(txtareaMedicalHistory);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(940, 310, 355, 130);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(20, 20, 90, 23);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102,100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(220, 40, 1090, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/healthcare-and-medical-background-with-cardiogram-line-free-vector_1.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, -470, 1980, 1340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCreateNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAccountActionPerformed
        // TODO add your handling code here:
        String email=txtEmail.getText();
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        String pName=txtPatientName.getText();
        String pContact=txtContactNo.getText();
        String pGender=(String) cmbSelectGender.getSelectedItem();
        String medHistory=txtareaMedicalHistory.getText();
        if (email.isEmpty() || username.isEmpty() || password.isEmpty() || pName.isEmpty() || pContact.isEmpty() || pGender.equals("-Select Gender-")) {
        JOptionPane.showMessageDialog(null, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!pContact.matches("\\d{12}"))
        {
        JOptionPane.showMessageDialog(null, "Enter a Valid Number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
             Patient patient1 = new Patient(email,username,password,pName,pGender,pContact,medHistory);
             patient1.saveUserInfo();
             JOptionPane.showMessageDialog(null, "You Are Sucessfully Registered", "Congrats", JOptionPane.ERROR_MESSAGE);
             LogPateint logPatient1 = new LogPateint();
             logPatient1.show();
             dispose();
        }
        
    }//GEN-LAST:event_btnCreateNewAccountActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void cmbSelectGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectGenderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        LogPateint logP=new LogPateint();
        logP.setVisible(true);;
        dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNewAccount;
    private javax.swing.JComboBox<String> cmbSelectGender;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblCreateNewPatientAccount;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPatientMedicalHistory;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblSelectGender;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextArea txtareaMedicalHistory;
    // End of variables declaration//GEN-END:variables
}
