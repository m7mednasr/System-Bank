
package qnsbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Connection_data {
    
    public Connection connection_data ( )
    {
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet=null;
        try{
            connect=DriverManager.getConnection("jdbc:mysql://localhost/bank?user=root&password=root");
            
            return connect ;
             
        }
        catch(Exception ex){
            System.out.println("Error");
            ex.printStackTrace();
        }
        return null ;
    }
}


