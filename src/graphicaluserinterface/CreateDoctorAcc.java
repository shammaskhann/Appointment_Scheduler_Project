package graphicaluserinterface;
import appointmentschedular.Doctor;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class CreateDoctorAcc extends javax.swing.JFrame {
 
    private Object textField;
    public CreateDoctorAcc() 
    {
        initComponents();
        {
          java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
          java.awt.Dimension screenSize = toolkit.getScreenSize();
          this.setSize(screenSize.width, screenSize.height);
          this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCreateNewDoctorAccount = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        lblSelectSpecialization = new javax.swing.JLabel();
        cmbSpecialization = new javax.swing.JComboBox<>();
        lblSelectTime = new javax.swing.JLabel();
        cmbSelectTime = new javax.swing.JComboBox<>();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCreateNewAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lblCreateNewDoctorAccount.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        lblCreateNewDoctorAccount.setText("Create New Doctor Account");
        jPanel1.add(lblCreateNewDoctorAccount);
        lblCreateNewDoctorAccount.setBounds(460, 40, 636, 62);

        lblEmail.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Enter Email");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(240, 170, 140, 32);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(600, 160, 268, 44);

        lblUsername.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Enter UserName");
        jPanel1.add(lblUsername);
        lblUsername.setBounds(230, 270, 200, 32);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername);
        txtUsername.setBounds(600, 260, 268, 44);

        lblDoctorName.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblDoctorName.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorName.setText("Enter Doctor Name");
        jPanel1.add(lblDoctorName);
        lblDoctorName.setBounds(230, 390, 230, 32);

        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtDoctorName);
        txtDoctorName.setBounds(600, 380, 268, 44);

        lblSelectSpecialization.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblSelectSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectSpecialization.setText("Select Specialization");
        jPanel1.add(lblSelectSpecialization);
        lblSelectSpecialization.setBounds(1050, 290, 237, 32);

        cmbSpecialization.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSpecialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[--SELECT--]", "Cardiologist", "Dermatologist", "Gastroenterologist", "Neurologist", "Oncologist", "Ophthalmologist", "Orthopedic Surgeon", "Pediatrician", "Psychiatrist", "Radiologist", "Urologist", "Obstetrician/Gynecologist", "Endocrinologist", "Nephrologist", "Pulmonologist", "Allergist/Immunologist", "Rheumatologist", "Anesthesiologist", "Plastic Surgeon", "Emergency Medicine Physician", "General Surgeon", "Family Medicine Physician", "Otolaryngologist (Ear, Nose, and Throat Specialist)", "Hematologist", "Infectious Disease Specialist", "Neonatologist", "Physical Medicine and Rehabilitation Specialist", "Vascular Surgeon", "Oculoplastic Surgeon", "Pain Management Specialist" }));
        cmbSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSpecializationActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSpecialization);
        cmbSpecialization.setBounds(1070, 380, 200, 50);

        lblSelectTime.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblSelectTime.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectTime.setText("Select Time");
        jPanel1.add(lblSelectTime);
        lblSelectTime.setBounds(240, 600, 150, 32);

        cmbSelectTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSelectTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[-Select Time-]", "12:00 pm - 2:00 pm", "2:00 pm - 4:00 pm", "4:00 pm - 6:00 pm", "6:00 pm - 8:00 pm", "8:00 pm - 10:00 pm", " " }));
        cmbSelectTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectTimeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSelectTime);
        cmbSelectTime.setBounds(600, 580, 268, 50);

        lblPassword.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Enter Password");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(240, 490, 190, 32);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(600, 480, 268, 45);

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
        btnCreateNewAccount.setBounds(600, 700, 320, 45);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 30, 90, 23);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102,100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 50, 1140, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/healthcare-and-medical-background-with-cardiogram-line-free-vector_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1550, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
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
        char[] pass=txtPassword.getPassword();
        String password= new String(pass);
        String dName=txtDoctorName.getText();
        String specialization = (String)cmbSpecialization.getSelectedItem();
        int time = cmbSelectTime.getSelectedIndex();
        int startHour=0;
        int endHour=0;
        if(time == 1){
            startHour=12;
            endHour=2;
        }else if(time == 2){
            startHour=2;
            endHour=4;
        }
        else if(time == 3){
            startHour=4;
            endHour=6;
        }else if(time == 4){
            startHour=6;
            endHour=8;
        }else if(time == 5){
            startHour=8;
            endHour=10;
        }
        if (email.isEmpty() || username.isEmpty() || password.isEmpty() || dName.isEmpty() || specialization.equals("[--SELECT--]") ) {
        JOptionPane.showMessageDialog(null, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(time==0){
        JOptionPane.showMessageDialog(null, "Please Select Time", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
             Doctor doctor1 = new Doctor(username,password,email,dName,specialization,startHour,endHour);
             doctor1.saveUserInfo();
             JOptionPane.showMessageDialog(null, "You Are Sucessfully Registered", "Congrats", JOptionPane.ERROR_MESSAGE);
             LogDoctor doctorLogin1 = new LogDoctor();
             doctorLogin1.show();
             dispose();
        }
        
    }//GEN-LAST:event_btnCreateNewAccountActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void cmbSelectTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectTimeActionPerformed

    private void cmbSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSpecializationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        LogDoctor ld=new LogDoctor();
        ld.show();
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
            java.util.logging.Logger.getLogger(CreateDoctorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateDoctorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateDoctorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateDoctorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateDoctorAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNewAccount;
    private javax.swing.JComboBox<String> cmbSelectTime;
    private javax.swing.JComboBox<String> cmbSpecialization;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCreateNewDoctorAccount;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSelectSpecialization;
    private javax.swing.JLabel lblSelectTime;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
