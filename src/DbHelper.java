
import java.sql.*;


public class DbHelper {
    private String userName="root";
    private String password="1234";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName, password);
    }
     public void showErrorMessage(SQLException exception){
        System.out.println("Hata!:"+exception.getMessage());
        System.out.println("Hata kodu:"+exception.getErrorCode());
    }
}
