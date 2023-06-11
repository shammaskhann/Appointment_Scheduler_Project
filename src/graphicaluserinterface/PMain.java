package graphicaluserinterface;

import appointmentschedular.Patient;
import javax.swing.JFrame;

/**
 *
 * @author Shammas PC
 */
public class PMain extends javax.swing.JFrame {
   
    private Patient patient;
    public PMain(Patient patient) {
       
        this.patient=patient;
        initComponents();
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public PMain() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCreateAppointment = new javax.swing.JButton();
        btnUpdateAppointment = new javax.swing.JButton();
        btnCancelAppointment = new javax.swing.JButton();
        btnScheduledAppointment = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblUsercode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 786));

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 786));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 786));
        jPanel2.setLayout(null);

        btnCreateAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateAppointment);
        btnCreateAppointment.setBounds(593, 170, 410, 53);

        btnUpdateAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateAppointment.setText("Update Appointment");
        btnUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppointmentActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdateAppointment);
        btnUpdateAppointment.setBounds(593, 260, 410, 47);

        btnCancelAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelAppointment.setText("Cancel Appointment");
        btnCancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAppointmentActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelAppointment);
        btnCancelAppointment.setBounds(590, 340, 410, 52);

        btnScheduledAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnScheduledAppointment.setText("Scheduled Appointment");
        btnScheduledAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduledAppointmentActionPerformed(evt);
            }
        });
        jPanel2.add(btnScheduledAppointment);
        btnScheduledAppointment.setBounds(593, 430, 410, 60);

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout);
        btnLogout.setBounds(720, 540, 182, 49);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51,100));

        lblUsercode.setBackground(new java.awt.Color(204, 204, 255));
        lblUsercode.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblUsercode.setForeground(new java.awt.Color(0, 0, 0));
        lblUsercode.setText("Welcome,"+patient.getPatientName());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblUsercode, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblUsercode, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(534, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(350, 40, 860, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/healthcare-and-medical-background-with-cardiogram-line-free-vector_1.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-280, -240, 2050, 1050);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        // TODO add your handling code here:
         PatientCUA1 cua = new PatientCUA1(patient);
        cua.show();
        dispose();
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnUpdateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppointmentActionPerformed
        // TODO add your handling code here:
         PatientUpdateApp1 updateApp = new PatientUpdateApp1 (patient);
        updateApp.show();
        dispose();
    }//GEN-LAST:event_btnUpdateAppointmentActionPerformed

    private void btnCancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAppointmentActionPerformed
        // TODO add your handling code here:
        PatientAppoinmentCancellation cancelApp=new  PatientAppoinmentCancellation(patient);
        cancelApp.show();
        dispose();
    }//GEN-LAST:event_btnCancelAppointmentActionPerformed

    private void btnScheduledAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduledAppointmentActionPerformed
        // TODO add your handling code here:
        ViewScheduledAppointment viewScheduledApp = new ViewScheduledAppointment(patient);
        viewScheduledApp.show();
        dispose();
    }//GEN-LAST:event_btnScheduledAppointmentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
         Home home = new Home();
        home.show();
        dispose();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelAppointment;
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnScheduledAppointment;
    private javax.swing.JButton btnUpdateAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUsercode;
    // End of variables declaration//GEN-END:variables
}
