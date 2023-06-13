package graphicaluserinterface;

import appointmentschedular.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Shammas PC
 */
public class PatientCUA1 extends javax.swing.JFrame {
    ArrayList<Object[]> data = new ArrayList<>();
    private Patient patient;
    public PatientCUA1(Patient patient) {
        this.patient=patient;
        initComponents();
        populateTable();
        populateDropdownList();
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public PatientCUA1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConfirmDoctor = new javax.swing.JButton();
        cmbSelectDoctor = new javax.swing.JComboBox<>();
        lblSelectDoctor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAppointments = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCreateYourAppointment = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 786));
        jPanel1.setLayout(null);

        btnConfirmDoctor.setBackground(new java.awt.Color(0, 51, 102));
        btnConfirmDoctor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConfirmDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmDoctor.setText("Confirm Doctor");
        btnConfirmDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmDoctor);
        btnConfirmDoctor.setBounds(580, 550, 170, 48);

        cmbSelectDoctor.setToolTipText("");
        cmbSelectDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSelectDoctor);
        cmbSelectDoctor.setBounds(530, 410, 235, 58);

        lblSelectDoctor.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblSelectDoctor.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectDoctor.setText("Select Doctor");
        jPanel1.add(lblSelectDoctor);
        lblSelectDoctor.setBounds(540, 260, 283, 69);

        tableAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableAppointments);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(830, 200, 452, 402);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(70, 50, 90, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/download-removebg-preview.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 680, 150, 158);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/rm373batch15-bg-11.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 234, 1200);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102,100));

        lblCreateYourAppointment.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblCreateYourAppointment.setText("Create Your Appointment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(lblCreateYourAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblCreateYourAppointment)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 110, 1030, 590);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphicaluserinterface/healthcare-and-medical-background-with-cardiogram-line-free-vector_1.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, -240, 2010, 1210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );

        pack();
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
} catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
}
    }
    public void populateTable(){
           try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
    String sql = "SELECT DoctorName, Speciallization FROM Doctors";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet resultSet = ps.executeQuery();
    String[] columnNames = {"DoctorName", "Speciallization"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    while (resultSet.next()) {
        String doctorName = resultSet.getString("DoctorName");
        String specialization = resultSet.getString("Speciallization");
        Object[] rowData = {doctorName, specialization};
        model.addRow(rowData);
    }
    tableAppointments.setModel(model);   
    ps.close();
    con.close();
} catch (SQLException | ClassNotFoundException e) {
               System.out.println(e);
}
    }
    private void cmbSelectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectDoctorActionPerformed

    private void btnConfirmDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDoctorActionPerformed
        // TODO add your handling code here:
        String DocSelect=(String) cmbSelectDoctor.getSelectedItem();
        SelTimDate std2 = new SelTimDate(DocSelect,patient);
        std2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfirmDoctorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PMain pMain=new PMain(patient);
        pMain.show();
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
            java.util.logging.Logger.getLogger(PatientCUA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientCUA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientCUA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientCUA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientCUA1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmDoctor;
    private javax.swing.JComboBox<String> cmbSelectDoctor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateYourAppointment;
    private javax.swing.JLabel lblSelectDoctor;
    private javax.swing.JTable tableAppointments;
    // End of variables declaration//GEN-END:variables
}
