package jdbcithtest;
import java.sql.*;
public class update {
    public void updateData(String newpass,String oun,String opd){
         PreparedStatement pst;
         int x;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/united","root","");
            pst=con.prepareStatement("update emp set pass=? where uname=? and pass=?");
                pst.setString(1,newpass);	
                pst.setString(2,oun);
		pst.setString(3,opd);
		
                x=pst.executeUpdate();
            if(x==1)
            {
            System.out.println("Record has been updated");
            }
        }catch(Exception e){System.out.println("please check the data: "+e.getMessage());} 
        
    }
    
}
