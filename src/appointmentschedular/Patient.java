    
package appointmentschedular;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Patient extends Login{
    private String patientName;
    private String contactNo;
    private String gender;
    private String medicalHistory;
    public Patient(){
        super();
    }  
    public Patient(String email,String user,String pass, String patientName,String gender,String contactNo, String medicalHistory){
        super(email,user,pass);
        this.patientName=patientName;
        this.gender=gender;
        this.contactNo=contactNo;
        this.medicalHistory=medicalHistory;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getContactNo(){
        return contactNo;
    }
    public String getMedicalHistory(){
        return medicalHistory;
    }
    public void setPatientName(String patientName){
        this.patientName=patientName;
    }
    public String getGender(){
        return this.gender;
    }
    public void setContactNo(String contactNo){
        this.contactNo=contactNo;
    }
    public void setMedicalHistory(String medicalHistory){
        this.medicalHistory=medicalHistory;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    @Override
    public void saveUserInfo(){
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            //Connection con = DatabaseConnection.getConnection();
            PreparedStatement prepStatement;
            prepStatement = con.prepareStatement("insert into patient(Password,Email,Username,PatientName,Gender,ContactNo,PatientMedicalHistory)values(?, ?, ?, ?, ?, ?, ?)");
                    prepStatement.setString(1, this.getEmail());
                    prepStatement.setString(2, this.getUser());
                    prepStatement.setString(3, this.getPass());
                    prepStatement.setString(4, this.getPatientName());
                    prepStatement.setString(5,this.getGender());
                    prepStatement.setString(6, this.getContactNo());
                    prepStatement.setString(7, this.getMedicalHistory());
                    prepStatement.executeUpdate();
                System.out.println("Data added sucessfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    @Override
     public Boolean login(String user,String pass)
     {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://myPatient.accdb");
            java.sql.Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from patient WHERE Username='" + user + "' AND Password='" + pass + "'");

            if (resultSet.next()) {
                String email = resultSet.getString("Email");
                String patientName = resultSet.getString("PatientName");
                String gender = resultSet.getString("Gender");
                String contactNo = resultSet.getString("ContactNo");
                String medicalHistory = resultSet.getString("PatientMedicalHistory");
                this.setUser(user);
                this.setPass(pass);
                this.setEmail(email);
                this.setPatientName(patientName);
                this.setContactNo(contactNo);
                this.setGender(gender);
                this.setMedicalHistory(medicalHistory);
                System.out.println("Login successfull ");
                resultSet.close();
                statement.close();
                con.close();
                return true;
            } else {
               System.out.println("Invalid username or password");
               resultSet.close();
               statement.close();
               con.close();
               return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
