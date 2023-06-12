
package appointmentschedular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Doctor extends Login{
    private String doctorName;
    private String specialization;
    private int startHours;
    private int endHours;
    public Doctor(){
        super();
    }
    public Doctor(String doctorName){
        super();
        this.doctorName=doctorName;
        this.specialization="";
        this.startHours=0;
        this.endHours=0;
    }
    public Doctor(String user,String pass,String email,String doctorName,String specialization,int startHours,int endHours){
        super(user,pass,email);
        this.doctorName=doctorName;
        this.specialization=specialization;
        this.startHours=startHours;
        this.endHours=endHours;
    }
    public int getStartHours(){
        return this.startHours;
    }
    public void setStartHours(int startHours)
    {
       this.startHours=startHours;
    }
    public String getDoctorName(){
        return doctorName;
    }
    public int getEndHours(){
        return this.endHours;
    }
    public void setEndHours(int endHours)
    {
       this.endHours=endHours;
    }
    public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    public static ArrayList<String> generateTimeSlots(LocalTime startTime, LocalTime endTime)//Func for generating timeslot for dropdown list between the timeslot
    {
        ArrayList<String> timeSlots = new ArrayList<>();
        while (startTime.isBefore(endTime)) {
            String timeSlot = startTime.format(DateTimeFormatter.ofPattern("h:mm a"));
            timeSlots.add(timeSlot);
            startTime = startTime.plusMinutes(15);
        }

        return timeSlots;
    }
    public Boolean deleteDoctor()
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            String query = "DELETE FROM Doctors WHERE DoctorName = ? ";
            PreparedStatement prepStatement = con.prepareStatement(query);
            prepStatement.setString(1,this.doctorName);
            int rowAffected=prepStatement.executeUpdate();
            prepStatement.close();
            if (rowAffected > 0 ) {
                return true;
            }
            else{
                return false;
            }
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    @Override
    public void saveUserInfo()
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            String query = "insert into Doctors(Username, Password, DoctorName, Speciallization,Email,StartTime,EndTime)values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStatement = con.prepareStatement(query);
            prepStatement.setString(1, this.getUser());
            prepStatement.setString(2, this.getPass());
            prepStatement.setString(3, this.getDoctorName());
            prepStatement.setString(4, this.getSpecialization());
            prepStatement.setString(5 , this.getEmail());
            prepStatement.setInt(6,this.getStartHours());
            prepStatement.setInt(7,this.getEndHours());
            prepStatement.executeUpdate();
            prepStatement.close();
        } catch(SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
            
    }
    @Override
    public Boolean login(String user,String pass)
    {

                try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            java.sql.Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Doctors WHERE Username='" + user + "' AND Password='" + pass + "'");

            if (resultSet.next()) {
                String doctorName = resultSet.getString("DoctorName");
                String specialization = resultSet.getString("Speciallization");
                String email = resultSet.getString("Email");
                int sTime = resultSet.getInt("StartTime");
                int eTime = resultSet.getInt("EndTime");
                this.setDoctorName(doctorName);
                this.setUser(user);
                this.setPass(pass);
                this.setEmail(email);
                this.setSpecialization(specialization);
                this.setStartHours(sTime);
                this.setEndHours(eTime);
                System.out.println("Login successfull ");
                resultSet.close();
                statement.close();
                con.close();
                // do something with the patient object, e.g. load it into another form
                return true;
            } else {
               System.out.println("Invalid username or password");
               resultSet.close();
               statement.close();
               con.close();
               return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println(ex);
            return false;
        }
    }
}
