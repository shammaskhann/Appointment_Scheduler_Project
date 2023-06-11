
package appointmentschedular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Appointment{
    LocalDate appointmentDate;
    LocalTime appointmentTime;
    private int appointmentNo;
    private Doctor doctor;
    private Patient patient;
    public Appointment(){
    }
    public Appointment(Doctor doctor,Patient patient,LocalDate date, LocalTime time){
        this.doctor=doctor;
        this.patient=patient;
        this.appointmentDate=date;
        this.appointmentTime=time;
    }
    public LocalDate getAppointmentDate(){
        return appointmentDate;
    }
    public LocalTime getAppointmentTime(){
        return appointmentTime;
    }
    public void setAppointmentDate(LocalDate appointmentDate){
        this.appointmentDate=appointmentDate;
    }
    public void setAppointmentTime(LocalTime appointmentTime){
        this.appointmentTime=appointmentTime;
    }
    public void setAppointmentNo(int appointmentNo){
        this.appointmentNo=appointmentNo;
    }
    public int getAppointmentNo(){
        return appointmentNo;
    }
    public void addAppointment()
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            String query = "INSERT INTO Appointments (DoctorName, PatientName, AppointmentDate, AppointmentTime,Gender,ContactNo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStatement = con.prepareStatement(query);
            prepStatement.setString(1, this.doctor.getDoctorName());
            prepStatement.setString(2, this.patient.getPatientName());
            prepStatement.setString(3, this.getAppointmentDate().toString());
            prepStatement.setString(4, this.getAppointmentTime().toString());
            prepStatement.setString(5,this.patient.getGender());
            prepStatement.setString(6,this.patient.getContactNo());
            prepStatement.executeUpdate();
            prepStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
        public Boolean removeAppointment(String appointmentNo,String pName,String dName,String gender,String contactNo)
        {
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
                String query = "DELETE FROM Appointments WHERE AppointmentNo = ? AND PatientName = ? AND DoctorName = ? AND Gender = ? AND ContactNo = ?";
                PreparedStatement prepStatement = con.prepareStatement(query);
                prepStatement.setString(1,appointmentNo);
                prepStatement.setString(2,pName);
                prepStatement.setString(3,dName);
                prepStatement.setString(4,gender);
                prepStatement.setString(5,contactNo);
                int rowsAffected = prepStatement.executeUpdate();
                prepStatement.close();
                con.close();
                if (rowsAffected > 0) {
                    return false;
                } else {
                    return true; 
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                return true;
            } catch (Exception e){
                System.out.println(e);
                return true;
            }   
        }
    public Boolean updateAppointment(int appointmentNo,String DoctorName,LocalDate appDate ,LocalTime appTime)
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            String query = "UPDATE Appointments SET AppointmentDate = ?, AppointmentTime = ? , DoctorName = ? WHERE AppointmentNo = ? AND PatientName = ?";
            PreparedStatement prepStatement = con.prepareStatement(query);
            prepStatement.setString(1, appDate.toString());
            prepStatement.setString(2, appTime.toString());
            prepStatement.setString(3,DoctorName);
            prepStatement.setInt(4, appointmentNo);
            prepStatement.setString(5,this.patient.getPatientName());
            int affectedRow=prepStatement.executeUpdate();
            prepStatement.close();
            if (affectedRow > 0) {
                return true;
            }
            else
            {
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public Boolean CheckDuplicateAppointment(String doctorName,LocalDate appointmentDate ,LocalTime appointmentTime)
    {
        Boolean flag=false;
        try {      
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
        String query = "SELECT COUNT(*) FROM Appointments WHERE AppointmentDate = ? AND AppointmentTime = ? AND DoctorName = ?";
        PreparedStatement prepStatement = con.prepareStatement(query);
        prepStatement.setString(1, appointmentDate.toString());
        prepStatement.setString(2, appointmentTime.toString());
        prepStatement.setString(3, doctorName);
        ResultSet resultSet = prepStatement.executeQuery();
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            if (count > 0) {
                flag=true;
            }
        }
        resultSet.close();
        prepStatement.close();
        con.close();
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
    }
    return flag;
    }
}
