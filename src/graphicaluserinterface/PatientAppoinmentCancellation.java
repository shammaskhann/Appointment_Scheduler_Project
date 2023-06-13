
package graphicaluserinterface;


import appointmentschedular.Appointment;
import appointmentschedular.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public final class PatientAppoinmentCancellation extends javax.swing.JFrame {

    private Patient patient;
    public PatientAppoinmentCancellation(Patient patient) {
     this.patient=patient;
     initComponents();
     populateDropdownList();
     txtPatientName.setText(patient.getPatientName());
    if(patient.getGender().equals("Male"))
        cmbSelectGender.setSelectedIndex(1);
    else if(patient.getGender().equals("Female"))
        cmbSelectGender.setSelectedIndex(2);
    txtContactNo.setText(patient.getContactNo());
     java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
     java.awt.Dimension screenSize = toolkit.getScreenSize();
     this.setSize(screenSize.width, screenSize.height);
     this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    PatientAppoinmentCancellation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPatientName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAppScheduledwithDoctor = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        txtAppointmentNo = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        btnCancelAppointment = new javax.swing.JButton();
        cmbSelectGender = new javax.swing.JComboBox<>();
        lblAppointmentCancelation = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblAppointmentNo = new javax.swing.JLabel();
        cmbSelectDoctor = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 786));

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102,100));

        lblPatientName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setText("Enter Patient Name:");

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");

        lblAppScheduledwithDoctor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAppScheduledwithDoctor.setForeground(new java.awt.Color(255, 255, 255));
        lblAppScheduledwithDoctor.setText("Appointment Scheduled with Doctor:");

        lblContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblContactNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblContactNumber.setText("Enter Contact Number:");

        txtAppointmentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentNoActionPerformed(evt);
            }
        });

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        btnCancelAppointment.setBackground(new java.awt.Color(0, 51, 102));
        btnCancelAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelAppointment.setText("CANCEL APPOINTMENT");
        btnCancelAppointment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAppointmentActionPerformed(evt);
            }
        });

        cmbSelectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Gender-", "Male", "Female", "Others" }));
        cmbSelectGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectGenderActionPerformed(evt);
            }
        });

        lblAppointmentCancelation.setBackground(new java.awt.Color(0, 51, 102));
        lblAppointmentCancelation.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        lblAppointmentCancelation.setText("Appointment Cancellation");

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        lblAppointmentNo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAppointmentNo.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointmentNo.setText("Appointment No:");

        cmbSelectDoctor.setToolTipText("");
        cmbSelectDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientName)
                            .addComponent(lblAppointmentNo)
                            .addComponent(lblGender)
                            .addComponent(lblContactNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAppointmentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectGender, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAppScheduledwithDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lblAppointmentCancelation, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAppointmentCancelation)
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAppointmentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAppointmentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPatientName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(cmbSelectGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNumber))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAppScheduledwithDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnCancelAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(340, 80, 1070, 670);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(70, 30, 80, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/download-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 630, 150, 120);

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/rm373batch15-bg-11.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 240, 810);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/healthcare-and-medical-background-with-cardiogram-line-free-vector.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 0, 1450, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void populateDropdownList(){
        try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
    String sql = "SELECT DoctorName FROM Doctors";
    PreparedStatement prepStatement = con.prepareStatement(sql);
    ResultSet resultSet = prepStatement.executeQuery();
    ArrayList<String> doctorNames = new ArrayList<>();
    while (resultSet.next()) {
        String doctorName = resultSet.getString("DoctorName");
        doctorNames.add(doctorName);
    }
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(doctorNames.toArray(new String[0]));
    cmbSelectDoctor.setModel(comboBoxModel);
    prepStatement.close();
    con.close();
} catch (SQLException e) {
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
    }
    private void txtAppointmentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmentNoActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void btnCancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAppointmentActionPerformed
    String patientName = txtPatientName.getText();
    String appointmentNo = txtAppointmentNo.getText();
    String gender = cmbSelectGender.getSelectedItem().toString();
    String contactNo = txtContactNo.getText();
    String doctorName = cmbSelectDoctor.getSelectedItem().toString();
    if (patientName.isEmpty() || appointmentNo.isEmpty() ||gender.isEmpty() || contactNo.isEmpty() || doctorName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    else{
        Appointment appointment = new Appointment();
        Boolean flag=appointment.removeAppointment(appointmentNo, patientName, doctorName, gender, contactNo);
        if (flag == false) {
            JOptionPane.showMessageDialog(this, "Appointment Canceled Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            PMain pm = new PMain(patient);
            pm.show();
            dispose();
        } else if (flag == true) {
            JOptionPane.showMessageDialog(this, "Error while canceling appointment, Re-Check the Entered Info", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnCancelAppointmentActionPerformed

    private void cmbSelectGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectGenderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PMain pMain=new PMain(patient) ;
        pMain.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void cmbSelectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(PatientAppoinmentCancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAppoinmentCancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAppoinmentCancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAppoinmentCancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new PatientAppoinmentCancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelAppointment;
    private javax.swing.JComboBox<String> cmbSelectDoctor;
    private javax.swing.JComboBox<String> cmbSelectGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAppScheduledwithDoctor;
    private javax.swing.JLabel lblAppointmentCancelation;
    private javax.swing.JLabel lblAppointmentNo;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTextField txtAppointmentNo;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
