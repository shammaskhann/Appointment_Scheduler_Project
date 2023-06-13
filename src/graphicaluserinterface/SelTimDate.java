/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicaluserinterface;
import appointmentschedular.Appointment;
import appointmentschedular.Doctor;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import static appointmentschedular.Doctor.generateTimeSlots;
import appointmentschedular.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;

public class SelTimDate extends javax.swing.JFrame {
    LocalDate currentDate = LocalDate.now();
    String docSelect;
    private Patient patient;
    public SelTimDate(String docSelect,Patient patient) {
        this.patient=patient;
        this.docSelect=docSelect;
        initComponents();
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public SelTimDate(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnConfirmAppointment = new javax.swing.JButton();
        lblSelectDate = new javax.swing.JLabel();
        int StartTime=0;
        int EndTime=0;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Doctors WHERE DoctorName='" + docSelect + "'");
            if (rs.next()) {
                StartTime = rs.getInt("StartTime");
                EndTime = rs.getInt("EndTime");
                rs.close();
                stmt.close();
                con.close();
            } else {
                System.out.println("Invalid username or password");
                rs.close();
                stmt.close();
                con.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        LocalTime startTime = LocalTime.of(StartTime,0); // Replace with the actual start time
        LocalTime endTime = LocalTime.of(EndTime, 0); // Replace with the actual end time
        ArrayList<String> timeSlots = generateTimeSlots(startTime, endTime);
        String[] array = timeSlots.toArray(new String[timeSlots.size()]);
        cmbSelectTime = new javax.swing.JComboBox<>(array);
        lblSelectTime = new javax.swing.JLabel();
        lblCreateYourAppointment = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 786));
        jPanel1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/download-removebg-preview.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 700, 150, 120);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(70, 40, 90, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/rm373batch15-bg-11.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -150, 240, 1490);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102,100));

        btnConfirmAppointment.setBackground(new java.awt.Color(0, 51, 102));
        btnConfirmAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConfirmAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmAppointment.setText("CONFIRM APPOINTMENT");
        btnConfirmAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAppointmentActionPerformed(evt);
            }
        });

        lblSelectDate.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblSelectDate.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectDate.setText("Select Date ");

        cmbSelectTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectTimeActionPerformed(evt);
            }
        });

        lblSelectTime.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblSelectTime.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectTime.setText("Select Time ");

        lblCreateYourAppointment.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        lblCreateYourAppointment.setText("Create Your Appointment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectTime, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelectTime, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(btnConfirmAppointment)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 215, Short.MAX_VALUE)
                .addComponent(lblCreateYourAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCreateYourAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(lblSelectTime, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cmbSelectTime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(lblSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnConfirmAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(430, 80, 990, 680);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/healthcare-and-medical-background-with-cardiogram-line-free-vector_1.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, -240, 1840, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2073, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAppointmentActionPerformed
        // TODO add your handling code here:
                 Doctor  doctor1 = new Doctor(docSelect);
                 LocalDate selectedDate = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                 long daysBetween = ChronoUnit.DAYS.between(currentDate, selectedDate);
      if (selectedDate.isBefore(currentDate)) 
      {
          JOptionPane.showMessageDialog(null, "Selected day cannot be a past date.", "Error", JOptionPane.ERROR_MESSAGE);
          } 
      else 
      {
         if (daysBetween > 7) 
         {
            JOptionPane.showMessageDialog(null, "Selected day is more than 7 days from current day.", "Error", JOptionPane.ERROR_MESSAGE);
         }else 
         {
             Object selectedItem=cmbSelectTime.getSelectedItem();
             String timeString = (String) selectedItem;
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
             LocalTime setTime =LocalTime.parse(timeString, formatter);
             
             Appointment appointment1 = new Appointment(doctor1,patient,selectedDate,setTime);
             Boolean nxt=appointment1.CheckDuplicateAppointment(docSelect,selectedDate,setTime);
             if (nxt==false) 
             {
                 appointment1.addAppointment();
                 JOptionPane.showMessageDialog(null, "Appointment Has been successfully Created at " + selectedDate.toString() + ".", "Success", JOptionPane.INFORMATION_MESSAGE);
                 PMain pMain = new PMain(patient);
                 pMain.show();
                 dispose();
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "The Date and Time is Already Reserved.", "Error", JOptionPane.ERROR_MESSAGE);
             }
         }
      }
    }//GEN-LAST:event_btnConfirmAppointmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here
        PatientCUA1 patientCreate=new PatientCUA1(patient);
        patientCreate.show();
        dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbSelectTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectTimeActionPerformed

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
            java.util.logging.Logger.getLogger(SelTimDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelTimDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelTimDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelTimDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SelTimDate().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmAppointment;
    private javax.swing.JComboBox<String> cmbSelectTime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCreateYourAppointment;
    private javax.swing.JLabel lblSelectDate;
    private javax.swing.JLabel lblSelectTime;
    // End of variables declaration//GEN-END:variables
}
