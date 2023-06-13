
package graphicaluserinterface;
import org.xml.sax.Attributes;

import javax.swing.JFrame;

/**
 *
 * @author Shammas PC
 */
public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
        // Get the default toolkit
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAppointmentSchedular = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        lblDoctor = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 786));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAppointmentSchedular.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        lblAppointmentSchedular.setForeground(new java.awt.Color(204, 204, 255));
        lblAppointmentSchedular.setText("APPOINTMENT SCHEDULAR");
        getContentPane().add(lblAppointmentSchedular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 750, 110));

        btnQuit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuit.setText("QUIT");
        btnQuit.setBorder(null);
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, 260, 60));

        btnPatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPatient.setText("PATIENT");
        btnPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));
        btnPatient.setBorderPainted(false);
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 250, 56));

        btnDoctor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDoctor.setText("DOCTOR");
        btnDoctor.setBorder(null);
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 270, 60));

        lblDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/125-1252462_deserve-a-doctor-doctor-icon-removebg-preview-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 460, 380));

        lblPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/png-transparent--removebg-preview.png"))); // NOI18N
        getContentPane().add(lblPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 310, 320));

        lblQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/blue-exit-icon-4-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 300, 280));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/rm373batch15-bg-11.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(1366, 786));
        jLabel5.setMinimumSize(new java.awt.Dimension(1366, 786));
        jLabel5.setPreferredSize(new java.awt.Dimension(1366, 786));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1830, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        LogPateint log1 = new LogPateint();
        log1.show();
        dispose();
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        LogDoctor logDoctor = new LogDoctor();
        logDoctor.show();
        dispose();
    }//GEN-LAST:event_btnDoctorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAppointmentSchedular;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblQuit;
    // End of variables declaration//GEN-END:variables
}
